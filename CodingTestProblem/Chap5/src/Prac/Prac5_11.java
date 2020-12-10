package Prac;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
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
	
}

public class Prac5_11 {
	public static int m, n;
	public static int[][] graph = new int[201][201];
	
	public static int dx[] = {-1, 1, 0, 0}; //»ó ÇÏ ÁÂ ¿ì
	public static int dy[] = {0, 0, -1, 1};
	
	public static int bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x,y));
		while(!q.isEmpty()) {
			Node node = q.poll();
			x = node.getIndex();
			y = node.getDistance();
			for(int i=0;i<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
			
                if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
         
                if (graph[nx][ny] == 0) continue;
             
                if(graph[nx][ny] == 1) {
                	graph[nx][ny] = graph[x][y] + 1;
                	q.offer(new Node(nx, ny));
                }
			}
		}
		return graph[m-1][n-1];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		m = scan.nextInt();
		n = scan.nextInt(); //¸ÊÀÇ Á¤º¸
		scan.nextLine();
		
		for(int i=0;i<m;i++) {
			String str = scan.nextLine();
			for(int j=0;j<n;j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}
		
		System.out.println(bfs(0,0));
	}

}
