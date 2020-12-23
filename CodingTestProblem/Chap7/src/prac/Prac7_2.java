package prac;

import java.util.Scanner;

public class Prac7_2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt(); //���� ����
	        int m = sc.nextInt(); //��û�� ���� ����

	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt(); //���� ���� ����
	        }
    
	        int start = 0;
	        int end = (int) 1e9;
	        int result = 0; 
	        
	        while (start <= end) {
	            long total = 0;
	            int mid = (start + end) / 2;
	            for (int i = 0; i < n; i++) {
	                if (arr[i] > mid) total += arr[i] - mid; 
	            }
	            if (total < m) { 
	                end = mid - 1;
	            }
	            else { 
	                result = mid; 
	                start = mid + 1;
	            }
	        }

	        System.out.println(result);
	    
	}

}
