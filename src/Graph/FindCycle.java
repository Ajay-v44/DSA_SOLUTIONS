package Graph;

import java.util.ArrayList;

//Find Cycles In A Un-Directed Graph
public class FindCycle {
    public static class Edge {
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
    public static boolean findCycleUn(ArrayList<Edge>[] graph, boolean[] visited, int current, int parent) {
        visited[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (visited[e.destination] && parent != e.destination)
                return true;
            if (!visited[e.destination])
                if (findCycleUn(graph, visited, e.destination, current))
                    return true;
        }
        return false;
    }

    static void main() {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 3, -1));
        System.out.println(findCycleUn(graph,visited,0,-1));

    }
}
