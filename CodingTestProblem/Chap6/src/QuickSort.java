import java.util.Scanner;

public class QuickSort {
	
	public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return; // 원소가 1개인 경우 종료
        int pivot = start; // 피벗은 첫 번째 원소
        int left = start + 1;
        int right = end;
        while (left <= right) {
            // 피벗보다 큰 데이터를 찾을 때까지 반복
            while (left <= end && arr[left] <= arr[pivot]) left++;
            // 피벗보다 작은 데이터를 찾을 때까지 반복
            while (right > start && arr[right] >= arr[pivot]) right--;
            // 엇갈렸다면 작은 데이터와 피벗을 교체
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자의 개수를 입력하세요: ");
		int n = scan.nextInt(); //숫자의 개수
		int[] arr = new int[n];
		
		System.out.println("숫자를 입력하세요: ");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		quickSort(arr,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] + " ");
		}
		

	}

}
