import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class SimpleDijkstra {
	public static final int INF = (int)1e9;
	public static int n, m, start;
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
	public static boolean[] visited = new boolean[100001];
	public static int[] d = new int[100001];
	
	public static int getSmallestNode() {
		int min_value = INF;
		int index = 0;
		for(int i=1;i<=n;i++) {
			if(d[i] < min_value && !visited[i]) {
				min_value = d[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void dijkstra(int start) {
		d[start] = 0;
		visited[start] = true;
		for(int i=0;i<graph.get(start).size();i++) {
			d[graph.get(start).get(i).getIndex()] = graph.get(start).get(i).getDistance();
		}
		
		for(int i=0;i<n-1;i++) {
			int now = getSmallestNode();
			visited[now] = true;
			for(int j=0;j<graph.get(now).size();j++) {
				int cost = d[now] + graph.get(now).get(j).getDistance();
				if(cost < d[graph.get(now).get(j).getIndex()]) {
					d[graph.get(now).get(j).getIndex()] = cost;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		start = scan.nextInt();
		
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Node>());
		}
		
		 for (int i = 0; i < m; i++) {
	            int a = scan.nextInt();
	            int b = scan.nextInt();
	            int c = scan.nextInt();
	            // a번 노드에서 b번 노드로 가는 비용이 c라는 의미
	            graph.get(a).add(new Node(b, c));
	      }
		 
		 Arrays.fill(d,INF);
		 dijkstra(start);
		 
		 for(int i = 1; i <= n; i++) {
			 if(d[i] == INF) {
				 System.out.println("INFINITY");
			 }
			 else {
				 System.out.println(d[i]);
			 }
		 }

	}

}
