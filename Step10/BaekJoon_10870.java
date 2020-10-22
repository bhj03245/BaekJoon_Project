import java.util.Scanner;

public class BaekJoon_10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(Fibonacci(n));
	}
	
	public static int Fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		
		return Fibonacci(n-1) + Fibonacci(n-2); 
	}
}
