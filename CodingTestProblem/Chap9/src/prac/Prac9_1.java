package prac;

import java.util.Arrays;
import java.util.Scanner;

public class Prac9_1 {
	 public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정
	 public static int n, m, x, k;
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
            graph[a][b] = 1;
        }
        
        x = scan.nextInt();
        k = scan.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    graph[j][k] = Math.min(graph[j][k], graph[j][i] + graph[i][k]);
                }
            }
        }
        
        int result = graph[1][k] + graph[k][x];
        
        if(result >= INF) {
        	System.out.println(-1);
        }
        else {
        	System.out.println(result);
        }
	}
}
