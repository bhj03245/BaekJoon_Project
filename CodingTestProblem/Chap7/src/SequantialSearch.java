

import java.util.Scanner;

public class SequantialSearch {
	public static int sequantialSearch(int n, String target, String[] arr) {
		for(int i=0;i<n;i++) {
			if(arr[i].equals(target)) {
				return i + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���� ������ �Է��� ���� �� ĭ ��� ã�� ���ڿ��� �Է��ϼ���.");
		int n = scan.nextInt();
		String target = scan.next();
		
		String[] arr = new String[n];
		System.out.println("�ռ� ���� ���� ������ŭ ���ڿ��� �Է��ϼ���. ������ ���� �� ĭ���� �մϴ�.");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.next();
		}
		int idx = sequantialSearch(n,target,arr);
		System.out.println(idx);
	}

}
