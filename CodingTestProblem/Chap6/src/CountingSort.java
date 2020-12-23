import java.util.Scanner;

public class CountingSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���.");
		final int max_value = scan.nextInt();
		int[] cnt = new int[max_value + 1];
		
		System.out.println("������ ������ �Է��ϼ���: ");
		int n = scan.nextInt(); //������ ����
		int[] arr = new int[n];
		
		System.out.println("���ڸ� �Է��ϼ���: ");
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
