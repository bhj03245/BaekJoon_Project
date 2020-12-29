import java.util.Arrays;
import java.util.Scanner;

public class Floyd_Warshall {
	 public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정
	 public static int n, m;
	 public static int[][] graph = new int[501][501];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        for (int i = 0; i < 501; i++) {
            Arrays.fill(graph[i], INF);
        }
  
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) graph[i][j] = 0;
            }
        }
   
        for (int i = 0; i < m; i++) {    
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            graph[a][b] = c;
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    graph[j][k] = Math.min(graph[j][k], graph[j][i] + graph[i][k]);
                }
            }
        }
     
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (graph[i][j] == INF) {
                    System.out.print("INFINITY ");
                }       
                else {
                    System.out.print(graph[i][j] + " ");
                }
            }
            System.out.println();
        }
	}
}
