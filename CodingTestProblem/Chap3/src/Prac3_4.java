import java.util.Scanner;

public class Prac3_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int result = 0;
		int cnt = 0;
		while(n>k) {
			if(n%k!=0) {
				n = n-1;
				cnt++;
			}
			else {
				n = n/k;
				cnt++;
			}
		}
		if(n%k==0) {
			cnt++;
			System.out.println(cnt);
		}
		else {
			while(n==1) {
				n--;
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
