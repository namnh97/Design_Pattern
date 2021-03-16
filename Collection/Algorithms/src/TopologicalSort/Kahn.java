package TopologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
public class Kahn {
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
        if (topologicalSort(graph, result)) {
            System.out.println("Topological Sort of graph: ");
            for (int x : result) {
                System.out.printf("%d ", x);
            }
        } else {
            System.out.println("No result");
        }

    }
    private static boolean topologicalSort(ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> result) {
        int V = graph.size();
        int[] inDegree = new int[V];
        Queue<Integer> zeroIndegree = new LinkedList<>();
        for (int u = 0; u < V; u++) {
            for (int v : graph.get(u)) {
                inDegree[v]++;
            }
        }
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                zeroIndegree.add(i);
            }
        }

        while (!zeroIndegree.isEmpty()) {
            int u = zeroIndegree.poll();
            result.add(u);
            for (int v : graph.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    zeroIndegree.add(v);
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
