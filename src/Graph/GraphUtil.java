package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphUtil {
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

    public static void createGraphMan(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0, -1));

    }

    //    BFS
    public static void graphBFS(ArrayList<Edge>[] graph) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        queue.add(0);

        while (!queue.isEmpty()) {
            int ele = queue.remove();
            if (!visited[ele]) {
                System.out.print(ele);
                visited[ele] = true;
                for (int i = 0; i < graph[ele].size(); i++) {
                    queue.add(graph[ele].get(i).destination);
                }
            }
        }

    }

    //    BFS For Disconnected Graphs
    public static void graphBFSDis(ArrayList<Edge>[] graph, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int ele = queue.remove();
            if (!visited[ele]) {
                System.out.print(ele);
                visited[ele] = true;
                for (int i = 0; i < graph[ele].size(); i++) {
                    queue.add(graph[ele].get(i).destination);
                }
            }
        }

    }

    // Depth First Search
    public static void graphDFS(ArrayList<Edge>[] graph, boolean[] visited, int current) {
        System.out.println(current);
        visited[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            if (!visited[graph[current].get(i).destination])
                graphDFS(graph, visited, graph[current].get(i).destination);
        }
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

        graphBFS(graph);

        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                graphBFSDis(graph, visited, i);
            }
        }

        System.out.println("=================   DFS   ===============");
        boolean[] visited2 = new boolean[graph.length];
        graphDFS(graph, visited2, 0);

        System.out.println("=================   DFS (Disjoint Graph  ===============");

        for (int i = 0; i < graph.length; i++) {
            if (!visited2[i]) {
                graphBFSDis(graph, visited2, i);
            }
        }
    }
}
