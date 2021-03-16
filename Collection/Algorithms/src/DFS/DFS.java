package Algorithms.DFS;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    private static ArrayList<ArrayList<Integer>> graph;
    private static int V;
    private static int E;
    private static ArrayList<Integer> path;
    private static ArrayList<Boolean> visited;

    private static void doDFS(int src) {
        Stack<Integer> s = new Stack<>();
        path = new ArrayList<>();
        visited = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            visited.add(false);
            path.add(-1);
        }
        visited.set(src, true);
        s.add(src);
        while (!s.isEmpty()) {
            int u = s.pop();
            for (int i = 0; i < graph.get(u).size(); i++) {
                int v = graph.get(u).get(i);
                if (!visited.get(v)) {
                    visited.set(v, true);
                    path.set(v, u);
                    s.add(v);
                }
            }
        }
    }
    private static void doDFSRecursion(int src) {
        visited.set(src, true);
        for (int i = 0; i < graph.get(src).size(); i++) {
            int v = graph.get(src).get(i);
            if (!visited.get(v)) {
                path.set(v, src);
                doDFSRecursion(v);
            }
        }
    }
}
