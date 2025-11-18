package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphUtil {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void createGraphMan(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1,0,-1));

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraphMan(graph);
//        neighbours of vertex 0
        for (int i = 0; i < graph[0].size(); i++) {
            Edge edge = graph[0].get(i);
            System.out.println(edge.destination);
        }
    }
}
