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
		System.out.println("맵의 크기를 입력하세요: ");
		int m = scan.nextInt();
		int n = scan.nextInt(); //n*m 맵의 크기 
		int [][]map = new int[m][n]; //전체 맵 정보를 받을 배열
		int [][]visit = new int[m][n]; //방문한 위치를 저장하기 위한 맵을 생성하여 0으로 초기화 
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		System.out.println("캐릭터의 위치와 캐릭터가 바라보고있는 방향을(0:북 1:동 2:남 3:서)입력하세요: ");
		int x = scan.nextInt();
		int y = scan.nextInt(); //캐릭터의 위치
		dir = scan.nextInt(); //캐릭터가 바라보고 있는 방향
		visit[x][y] = 1;
		
		System.out.println("맵의 정보를 입력하세요.(1:바다 OR 0:육지)");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				map[i][j] = scan.nextInt(); //전체 맵정보
			}
		}
		
		int cnt = 1; //이동횟수
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
		System.out.println("이동횟수");
		System.out.println(cnt);
	}

}
