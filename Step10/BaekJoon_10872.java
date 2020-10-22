import java.util.Scanner;

public class BaekJoon_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int sum = factorial(num);
		System.out.println(sum);
		
	}
	public static int factorial(int n) {
		if(n<=1) return 1;
		return n * factorial(n-1);
	}

}
