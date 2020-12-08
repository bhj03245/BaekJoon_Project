import java.util.Scanner;

public class Prac4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //n시 59분 59초까지의 모든 시각 중 3이 하나라도 포함되는 모든 경우의 수 
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
