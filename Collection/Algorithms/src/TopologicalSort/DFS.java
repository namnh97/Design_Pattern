package TopologicalSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
8 9
0 1
1 2
1 5
1 6
4 1
4 7
7 6
3 7
3 5
 */
public class DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
        }
        ArrayList<Integer> result = new ArrayList<>();
        topologicalSort(graph, result);
        System.out.println("Topological sort of graph");
        for (Integer x : result) {
            System.out.printf("%d", x);
        }
    }

    private static void topologicalSort(ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> result) {
        int V = graph.size();
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                run(i, graph, visited, result);
            }
        }
        Collections.reverse(result);
    }
    public static void run(int u, ArrayList<ArrayList<Integer>> graph, boolean[] visited, ArrayList<Integer> result) {
        visited[u] = true;
        for (int i = 0; i < graph.get(u).size(); i++) {
            int v = graph.get(u).get(i);
            if (visited[v] == false) {
                run(v, graph, visited, result);
            }
        }
        result.add(u);
    }
}
