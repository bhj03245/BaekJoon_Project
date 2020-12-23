package prac;

import java.util.Scanner;

public class Prac7_1 {
	public static int binary_search(int[]arr, int target, int start, int end) {
		int mid = (start+end)/2;
		if(start>end) return -1;
		if(arr[mid]==target) {
			return mid;
		}
		else if(arr[mid] > target) {
			return binary_search(arr,target,start,mid-1);
		}
		else {
			return binary_search(arr,target,mid+1,end);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		int m = scan.nextInt();
		int target[] = new int[m];
		for(int i=0;i<m;i++) {
			target[i] = scan.nextInt();
		}
		
		for(int i=0;i<m;i++) {
			int result = binary_search(arr, target[i], 0, n-1) + 1;
			if(result == 0) {
				System.out.print("no" + "\t");
			}
			else {
				System.out.print("yes" + "\t");
			}
		}
	}
}
