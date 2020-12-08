import java.util.Scanner;

public class Prac4_4 {
	 public static int dir, nx, ny;
	 public static void turn_left() {
	        dir -= 1;
	        if (dir == -1) dir = 3;
	   }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ũ�⸦ �Է��ϼ���: ");
		int m = scan.nextInt();
		int n = scan.nextInt(); //n*m ���� ũ�� 
		int [][]map = new int[m][n]; //��ü �� ������ ���� �迭
		int [][]visit = new int[m][n]; //�湮�� ��ġ�� �����ϱ� ���� ���� �����Ͽ� 0���� �ʱ�ȭ 
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		System.out.println("ĳ������ ��ġ�� ĳ���Ͱ� �ٶ󺸰��ִ� ������(0:�� 1:�� 2:�� 3:��)�Է��ϼ���: ");
		int x = scan.nextInt();
		int y = scan.nextInt(); //ĳ������ ��ġ
		dir = scan.nextInt(); //ĳ���Ͱ� �ٶ󺸰� �ִ� ����
		visit[x][y] = 1;
		
		System.out.println("���� ������ �Է��ϼ���.(1:�ٴ� OR 0:����)");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				map[i][j] = scan.nextInt(); //��ü ������
			}
		}
		
		int cnt = 1; //�̵�Ƚ��
		int turn_time = 0;
		
		while(true) {
			turn_left();
			nx = x + dx[dir];
			ny = y + dy[dir];
			
			if(visit[nx][ny] == 0 && map[nx][ny] == 0) {
				visit[nx][ny] = 1;
				x = nx;
				y = ny;
				cnt++;
				turn_time = 0;
				continue;
			}
			else {
				turn_time++;
			}
			
			if(turn_time==4) {
				nx = x - dx[dir];
				ny = y - dy[dir];
				if(map[nx][ny] == 0) {
					x = nx;
					y = ny;
				}
				else {
					break;
				}
				turn_time = 0;
			}
		}
		System.out.println("�̵�Ƚ��");
		System.out.println(cnt);
	}

}
