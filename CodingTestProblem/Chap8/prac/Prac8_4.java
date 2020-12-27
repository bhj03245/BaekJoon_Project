package prac;

import java.util.Arrays;
import java.util.Scanner;

public class Prac8_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] d = new int[m+1];
		Arrays.fill(d, 10001);
		d[0] = 0;
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                if (d[j - arr[i]] != 10001) {
                    d[j] = Math.min(d[j], d[j - arr[i]] + 1);
                }
            }
        }

        if (d[m] == 10001) { 
            System.out.println(-1);
        }
        else {
            System.out.println(d[m]);
        }
	}

}
