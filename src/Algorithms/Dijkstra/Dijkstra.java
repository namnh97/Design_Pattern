/*
 * Author : AdNovum Informatik AG
 */

package Algorithms.Dijkstra;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
	public ArrayList<ArrayList<Node>> graph;
	public int[] dist;
	public int[] path;

	public class Node implements Comparable<Node> {
		public Integer id;
		public Integer dist;

		Node(Integer id, Integer dist) {
			this.id = id;
			this.dist = dist;
		}

		@Override
		public int compareTo(Node other) {
			return this.dist.compareTo(other.dist);
		}
	}

	public void run(int source) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int n = graph.size();
		dist = new int[n];
		path = new int[n];
		for (int i = 0; i < n; i++) {
			dist[i] = Integer.MAX_VALUE;
			path[i] = -1;
		}
		pq.add(new Node(source, 0));
		dist[source] = 0;
		while (!pq.isEmpty()) {
			Node top = pq.poll();
			int u = top.id;
			int w = top.dist;
			if (dist[u] != w) continue;
			for (int i = 0; i < graph.get(u).size(); i++) {
				Node v = graph.get(u).get(i);
				if (dist[v.id] > w + v.dist) {
					dist[v.id] = w + v.dist;
					pq.add(new Node(v.id, dist[v.id]));
					path[v.id] = u;
				}
			}
		}
	}

}
