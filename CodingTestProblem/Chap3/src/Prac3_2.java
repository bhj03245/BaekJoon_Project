import java.util.Arrays;
import java.util.Scanner;

public class Prac3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //�迭�� �� ������ ����
		int m = scan.nextInt(); //���ڸ� ���� Ƚ��
		int k = scan.nextInt(); //�ݺ������� Ƚ�� 
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		int first = arr[arr.length-1];
		int second = arr[arr.length-2];
		
		int cnt = (m/(k+1)) * k; //k���� �ʰ��Ͽ� ����  �� ���� ������ k+1�� �ݺ�
		cnt += (m%(k+1)); // m�� k+1�� ������ �������� �ʴ� ���
		
		int result = 0;
		result += first * cnt;
		result += second*(m-cnt);
		System.out.println(result);
	}

}
