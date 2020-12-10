package Prac;
import java.util.Scanner;

public class Prac5_10 {
	public static int m, n;
	public static int[][] graph = new int[1000][1000];
	
	public static boolean dfs(int x, int y) {
		if(x<=-1 || x >=m || y<=-1 || y>=n) {
			return false;
		}
		if(graph[x][y] == 0) {
			graph[x][y] = 1;
			dfs(x-1,y);
			dfs(x,y-1);
			dfs(x+1,y);
			dfs(x,y+1);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		n = scan.nextInt(); //∏ ¿« ≈©±‚ 
		int result = 0;
		scan.nextLine();
		
		for(int i=0;i<m;i++) {
			String str = scan.nextLine();
			for(int j=0;j<n;j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(dfs(i,j)) {
					result += 1;
				}
			}
		}
		
		System.out.println(result);
	}

}
