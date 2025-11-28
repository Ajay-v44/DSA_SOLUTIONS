package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SourceToDestination {
    public static void findPathFromSouToDes(List<GraphUtil.Edge>[] edges, boolean[] visited, int target, int current, String path) {
        if (current == target) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < edges[current].size(); i++) {
            GraphUtil.Edge e=edges[current].get(i);
            if (!visited[e.destination]) {
                visited[current] = true;
                findPathFromSouToDes(edges, visited, target, e.destination, path + e.destination);
                visited[current] = false;
            }
        }
    }

    static void main(String[] args) {
        int V = 4;
        ArrayList<GraphUtil.Edge>[] graph = new ArrayList[V];
        GraphUtil.createGraphMan(graph);
        boolean[] visited=new boolean[graph.length];
        findPathFromSouToDes(graph,visited,1,0,"");
    }
}
