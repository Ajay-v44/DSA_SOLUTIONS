package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphUtil {
    static class Edge{
        int source;
        int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }
    public static void createGraphMan(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph =new ArrayList[V];

    }
}
