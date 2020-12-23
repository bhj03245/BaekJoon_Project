package Prac;

import java.util.*;

public class Prac6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("수열에 속해있는 숫자의 개수를 입력하시오: ");
		int n = scan.nextInt(); 
		Integer[] arr = new Integer[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
