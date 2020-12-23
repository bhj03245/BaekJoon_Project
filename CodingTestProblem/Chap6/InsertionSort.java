import java.util.Scanner;

public class InsertionSort {

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
        for (int i = 1; i < n; i++) {
            // �ε��� i���� 1���� �����ϸ� �ݺ��ϴ� ����
            for (int j = i; j > 0; j--) {
                // �� ĭ�� �������� �̵�
                if (arr[j] < arr[j - 1]) {
                    // ������(Swap)
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                // �ڱ⺸�� ���� �����͸� ������ �� ��ġ���� ����
                else break;
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

	}

}
