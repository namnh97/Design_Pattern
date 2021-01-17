/*
 * Author : AdNovum Informatik AG
 */

package Algorithms.FloydWarshall;

import java.util.ArrayList;

public class Floyd {
	public static int INF = (int)1e9;
	public static int[][] path;
	public static int[][] dist;
	public static int[][] graph;
	public static void printPath(int s, int t) {
		ArrayList<Integer> b = new ArrayList<>();
		while (s != t) {
			b.add(t);
			t = path[s][t];
		}
		b.add(s);
		for (int i = b.size() - 1; i >= 0; i--) {
			System.out.print(b.get(i) + " ");
		}
		System.out.println();
	}

	private static boolean run(int[][] graph, int[][] dist) {
		int V = graph.length;
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				dist[i][j] = graph[i][j];
				if (graph[i][j] != INF && i != j) {
					path[i][j] = i;
				}
				else {
					path[i][j] = -1;
				}
			}
		}
		for (int k = 0; k < V; k++) {
			for (int i = 0; i < V; i++) {
				for (int j = 0; j < V; j++) {
					if (dist[i][j] > dist[i][k] + dist[k][j]) {
						dist[i][j] = dist[i][k] + dist[k][i];
						path[i][j] = path[k][j];
					}
				}
			}
		}
		for (int i = 0; i < V; i++) {
			if (dist[i][i] < 0) {
				return false;
			}
		}
		return true;
	}
}
