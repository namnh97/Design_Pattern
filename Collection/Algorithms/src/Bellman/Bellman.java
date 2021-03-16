/*
 * Author : AdNovum Informatik AG
 */

package Algorithms.Bellman;

public class Bellman {
	class Edge {
		public int source;
		public int target;
		public int weight;

		Edge(int source, int target, int weight) {
			this.source = source;
			this.target = target;
			this.weight = weight;
		}
	}
	private static final int INF = (int)1e9;
	private static final int MAX = 105;
	private static int[] dist = new int[MAX];
	private static Edge[] graph;
	private static int n, m;
	private static int[] path = new int[MAX];
	private static boolean run(int source) {
		int u, v, w;
		dist[source] = 0;
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 0; j < m; j++) {
				u = graph[j].source;
				v = graph[j].target;
				w = graph[j].weight;
				if (dist[u] != INF && dist[u] + w < dist[v]) {
					dist[v] = dist[u] + w;
					path[v] = u;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			u = graph[i].source;
			v = graph[i].target;
			w = graph[i].weight;
			if (dist[u] != INF && dist[u] + w < dist[v]) {
				return false;
			}
		}
		return true;
	}
}
