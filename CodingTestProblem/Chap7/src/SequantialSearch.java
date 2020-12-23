

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
		System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
		int n = scan.nextInt();
		String target = scan.next();
		
		String[] arr = new String[n];
		System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰끼 한 칸으로 합니다.");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.next();
		}
		int idx = sequantialSearch(n,target,arr);
		System.out.println(idx);
	}

}
