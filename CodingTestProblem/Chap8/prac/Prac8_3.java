package prac;

import java.util.Scanner;

public class Prac8_3 {
	public static int[] d = new int[1001];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		d[1] = 1;
		d[2] = 3;
		
		for(int i=3;i<=n;i++) {
			d[i] = (d[i-1] + 2*d[i-2])%796796;
		}
		
		System.out.println(d[n]);
	}

}
