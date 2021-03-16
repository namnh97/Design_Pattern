package Code;

import FastIO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Problem1 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        while (m-- > 0) {
            int u = in.nextInt();
            int v = in.nextInt();
            graph.get(--u).add(--v);
        }

        int[] result = new int[n];
        if (topologicalSort(graph, result)) {
            for (int i = 0; i < n; i++) {
                out.print(++result[i] + " ");
            }
        } else {
            out.print("Sandro fails.");
        }
    }

    private boolean topologicalSort(ArrayList<ArrayList<Integer>> graph, int[] result) {
        int V = graph.size();
        int[] inDegree = new int[V];
        for (int u = 0; u < V; u++) {
            for (int v : graph.get(u)) {
                inDegree[v]++;
            }
        }

        PriorityQueue<Integer> zeroDegree = new PriorityQueue<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                zeroDegree.add(i);
            }
        }

        int first = 0;
        while (!zeroDegree.isEmpty()) {
            int u = zeroDegree.poll();
            result[first++] = u;
            for (int v : graph.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    zeroDegree.add(v);
                }
            }
        }
        for (int i = 0; i < V; i++) {
            if (inDegree[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
