import java.util.Scanner;

public class Prac3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�մԿ��� �Ž�������� �� �Է�: ");
		int n = scan.nextInt();
		int cnt = 0;
		if(n%10!=0) {
			System.out.println("�Ž�������ҵ��� �׻� 10�� ������� �Ѵ�.");
		}
		int[] coin_types = {500, 100, 50, 10};
		for(int coin : coin_types) {
			cnt += (n/coin);
			n = n%coin;
		}
		System.out.println(cnt);
	}

}
