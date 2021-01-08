import java.util.Scanner;

public class Boling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr = new int[11];
		
		for(int i=0;i<n;i++) {
			int x = scan.nextInt();
			arr[x] += 1;
		}
		
		int min = 0;
		
		for(int i=1;i<11;i++) {
			if(arr[i] > 1) {
				min += (arr[i]*arr[i]-1)/2;
			}
		}
		
		int result = (n*(n-1))/2;
		System.out.println(result - min);
	}

}
