import java.util.Scanner;

public class Prac3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //За
		int m = scan.nextInt(); //ї­
		int min = 10001;
		int result = 0;
		int[][] arr = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(min>arr[i][j]) {
					min = arr[i][j];
				}
			}
			result = Math.max(result, min);
			min = 10001;
		}
		System.out.println(result);
		
	}

}
