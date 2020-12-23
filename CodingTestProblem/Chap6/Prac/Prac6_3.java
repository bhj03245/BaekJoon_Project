package Prac;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prac6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //배열의 크기
		int k = scan.nextInt(); //바꿔치기 연산 수행횟수
		int tmp,sum = 0;
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			b[i] = scan.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b,Collections.reverseOrder());
		
		for(int i=0;i<k;i++) {
			if(a[i] < b[i]) {
				tmp = a[i];
				a[i] = b[i];
				b[i] = a[i];
			}
			else break;
		}
		
		for(int i=0;i<n;i++) {
			sum += a[i];
		}
		
		System.out.println(sum);
	}

}
