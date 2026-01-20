package Graph;


import java.util.ArrayList;
import java.util.PriorityQueue;


public class PrimsAlgorithm {
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

    public static class Pair implements Comparable<Pair> {
        int edge, weight;

        Pair(int edge, int weight) {
            this.edge = edge;
            this.weight = weight;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.weight - p2.weight;
        }
    }

    public static int minCostSpanTree(ArrayList<Edge>[] graph, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[V];
        int minCost = 0;
        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair pair = pq.remove();
            if (!visited[pair.edge]) {
                visited[pair.edge] = true;
                minCost += pair.weight;
                for (int i = 0; i < graph[pair.edge].size(); i++) {
                    Edge e = graph[pair.edge].get(i);
                    if (!visited[e.destination]) {
                        pq.add(new Pair(e.destination, e.weight));
                    }

                }
            }

        }
        return minCost;
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

    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph,V);
        System.out.println(minCostSpanTree(graph,V));

    }
}
