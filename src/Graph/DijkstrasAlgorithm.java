package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {
    public static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static class Pairs implements Comparable<Pairs> {
        int node;
        int distance;

        Pairs(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Pairs p2) {
            return this.distance - p2.distance;
        }

    }

    public static void createGraph(ArrayList<Edge>[] graph, int V) {
        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 0, 4));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 5));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 8));
        graph[2].add(new Edge(2, 4, 10));

        graph[3].add(new Edge(3, 1, 5));
        graph[3].add(new Edge(3, 2, 8));
        graph[3].add(new Edge(3, 4, 2));
        graph[3].add(new Edge(3, 5, 6));

        graph[4].add(new Edge(4, 2, 10));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 3));

        graph[5].add(new Edge(5, 3, 6));
        graph[5].add(new Edge(5, 4, 3));

    }

    public static void dijkstrasAlgorithm(ArrayList<Edge>[] graph, int V, int src) {
        boolean[] visited = new boolean[V];
        int[] distance = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src)
                distance[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<Pairs> pq = new PriorityQueue<>();
        pq.add(new Pairs(0, 0));
        while (!pq.isEmpty()) {
            Pairs p = pq.remove();
            if (!visited[p.node]) {
                visited[p.node] = true;
                for (int i = 0; i < graph[p.node].size(); i++) {
                    Edge e = graph[p.node].get(i);
                    int u = e.source;
                    int v = e.destination;
                    if (distance[u] + e.weight < distance[v]) {
                        distance[v] = distance[u] + e.weight;
                        pq.add(new Pairs(v, distance[v]));
                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.println(distance[i]);

        }
    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph,V);
        dijkstrasAlgorithm(graph,V,0);
    }
}
