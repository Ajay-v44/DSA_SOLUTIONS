package Graph;

import java.util.ArrayList;

public class BellManFordAlgorithm {
    public static void createGraph(ArrayList<DijkstrasAlgorithm.Edge>[] graph, int V) {
        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new DijkstrasAlgorithm.Edge(0, 1, 4));
        graph[0].add(new DijkstrasAlgorithm.Edge(0, 2, 2));

        graph[1].add(new DijkstrasAlgorithm.Edge(1, 0, 4));
        graph[1].add(new DijkstrasAlgorithm.Edge(1, 2, 1));
        graph[1].add(new DijkstrasAlgorithm.Edge(1, 3, 5));

        graph[2].add(new DijkstrasAlgorithm.Edge(2, 0, 2));
        graph[2].add(new DijkstrasAlgorithm.Edge(2, 1, 1));
        graph[2].add(new DijkstrasAlgorithm.Edge(2, 3, 8));
        graph[2].add(new DijkstrasAlgorithm.Edge(2, 4, 10));

        graph[3].add(new DijkstrasAlgorithm.Edge(3, 1, 5));
        graph[3].add(new DijkstrasAlgorithm.Edge(3, 2, 8));
        graph[3].add(new DijkstrasAlgorithm.Edge(3, 4, 2));
        graph[3].add(new DijkstrasAlgorithm.Edge(3, 5, 6));

        graph[4].add(new DijkstrasAlgorithm.Edge(4, 2, 10));
        graph[4].add(new DijkstrasAlgorithm.Edge(4, 3, 2));
        graph[4].add(new DijkstrasAlgorithm.Edge(4, 5, 3));

        graph[5].add(new DijkstrasAlgorithm.Edge(5, 3, 6));
        graph[5].add(new DijkstrasAlgorithm.Edge(5, 4, 3));

    }

    public static void bellmanFordAlgorithm(ArrayList<DijkstrasAlgorithm.Edge>[] graph, int V, int src) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++)
            if (i != src)
                dist[i] = Integer.MAX_VALUE;

        for (int k = 0; k < V - 1; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < graph[i].size(); j++) {
                    DijkstrasAlgorithm.Edge edge = graph[i].get(j);
                    int u = edge.source;
                    int v = edge.destination;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + edge.weight < dist[v]) {
                        dist[v] = dist[u] + edge.weight;
                    }
                }
            }
        }


        for (int i = 0; i < V; i++) {
            System.out.printf(dist[i] + " ");
        }
    }

    static void main() {
        int V = 6;
        ArrayList<DijkstrasAlgorithm.Edge>[] graph = new ArrayList[V];
        createGraph(graph, V);
        bellmanFordAlgorithm(graph, V, 0);

    }
}
