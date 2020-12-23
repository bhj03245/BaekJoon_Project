import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���: ");
		int n = scan.nextInt(); //������ ����
		int[] arr = new int[n];
		
		System.out.println("���ڸ� �Է��ϼ���: ");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		//��������
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
		
		System.out.println("���ĵ� ������ ����: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
