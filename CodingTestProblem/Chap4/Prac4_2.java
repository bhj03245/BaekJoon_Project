import java.util.Scanner;

public class Prac4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //n�� 59�� 59�ʱ����� ��� �ð� �� 3�� �ϳ��� ���ԵǴ� ��� ����� �� 
		int cnt = 0;
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<60;j++) {
				for(int k=0;k<60;k++) {
					if(Integer.toString(k).contains("3") || Integer.toString(j).contains("3") || Integer.toString(i).contains("3")) {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}

}
