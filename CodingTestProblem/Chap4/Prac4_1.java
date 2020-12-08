import java.util.Scanner;

public class Prac4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정사각형의 크기 입력: ");
		int size = scan.nextInt(); //정사각형 크기
		scan.nextLine();
		System.out.println("이동 계획 입력(L,R,U,D): ");
		String[] dir = scan.nextLine().split(" ");
		int x = 1, y = 1;
		
		for(int i=0; i<dir.length;i++) {
			if(dir[i].equals("R") || dir[i].equals("r")) {
				y += 1;
				if(y >= size) {
					y--;
					continue;
				}
			}
			else if(dir[i].equals("L") || dir[i].equals("l")) {
				y -= 1;
				if(y < 1) {
					y++;
					continue;
				}
			}
			else if(dir[i].equals("U") || dir[i].equals("u")) {
				x -= 1;
				if(x < 1) {
					x++;
					continue;
				}
			}
			else if(dir[i].equals("D") || dir[i].equals("d")) {
				x += 1;
				if(x >= size) {
					x--;
					continue;
				}
			}
		}
		
		System.out.println(x+" "+y);
	}

}
