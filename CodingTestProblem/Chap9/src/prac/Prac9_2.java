package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node> {

	private int index;
	private int distance;

	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}

	public int getIndex() {
		return this.index;
	}

	public int getDistance() {
		return this.distance;
	}

	@Override
	public int compareTo(Node other) {
		if (this.distance < other.distance) {
			return -1;
		}
		return 1;
	}
}

public class Prac9_2 {
	public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정
	public static int n, m, start;
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
	public static int[] d = new int[100001];

	public static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		d[start] = 0;
		while (!pq.isEmpty()) {
			Node node = pq.poll();
			int dist = node.getDistance(); 
			int now = node.getIndex(); 
			if (d[now] < dist)
				continue;
			for (int i = 0; i < graph.get(now).size(); i++) {
				int cost = d[now] + graph.get(now).get(i).getDistance();
				if (cost < d[graph.get(now).get(i).getIndex()]) {
					d[graph.get(now).get(i).getIndex()] = cost;
					pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		start = scan.nextInt();
		
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Node>());
		}
		
		for (int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			graph.get(a).add(new Node(b, c));
		}
		
		Arrays.fill(d, INF);
		
		dijkstra(start);
		
		int count = 0;
        int maxDistance = 0;
        for (int i = 1; i <= n; i++) {
            if (d[i] != INF) {
                count += 1;
                maxDistance = Math.max(maxDistance, d[i]);
            }
        }

        System.out.println((count - 1) + " " + maxDistance);
	}
}
