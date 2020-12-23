import java.util.Scanner;

public class QuickSort {
	
	public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return; // ���Ұ� 1���� ��� ����
        int pivot = start; // �ǹ��� ù ��° ����
        int left = start + 1;
        int right = end;
        while (left <= right) {
            // �ǹ����� ū �����͸� ã�� ������ �ݺ�
            while (left <= end && arr[left] <= arr[pivot]) left++;
            // �ǹ����� ���� �����͸� ã�� ������ �ݺ�
            while (right > start && arr[right] >= arr[pivot]) right--;
            // �����ȴٸ� ���� �����Ϳ� �ǹ��� ��ü
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            // �������� �ʾҴٸ� ���� �����Ϳ� ū �����͸� ��ü
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // ���� ���� ���� �κа� ������ �κп��� ���� ���� ����
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���: ");
		int n = scan.nextInt(); //������ ����
		int[] arr = new int[n];
		
		System.out.println("���ڸ� �Է��ϼ���: ");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		quickSort(arr,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] + " ");
		}
		

	}

}
