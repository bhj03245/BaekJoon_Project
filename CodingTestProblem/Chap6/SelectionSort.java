import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자의 개수를 입력하세요: ");
		int n = scan.nextInt(); //숫자의 개수
		int[] arr = new int[n];
		
		System.out.println("숫자를 입력하세요: ");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		//선택정렬
		for(int i=0;i<n;i++) {
			int min_index = i;
			for(int j=i+1;j<n;j++) {
				if(arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = tmp;
		}
		
		System.out.println("정렬된 이후의 숫자: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
