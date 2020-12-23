import java.util.Scanner;

public class CountingSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자의 범위를 입력하세요.");
		final int max_value = scan.nextInt();
		int[] cnt = new int[max_value + 1];
		
		System.out.println("숫자의 개수를 입력하세요: ");
		int n = scan.nextInt(); //숫자의 개수
		int[] arr = new int[n];
		
		System.out.println("숫자를 입력하세요: ");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			cnt[arr[i]] += 1;
		}
		
		for(int i=0;i<max_value;i++) {
			for(int j=0;j<cnt[i];j++) {
				System.out.println(i + " ");
			}
		}
	}

}
