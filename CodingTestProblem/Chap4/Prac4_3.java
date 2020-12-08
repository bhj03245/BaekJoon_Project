import java.util.Scanner;

public class Prac4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("열과행 입력(ex)>a1): ");
		String loc = scan.nextLine();
		char x = loc.charAt(1);
		char y = loc.charAt(0);
		int num = 8;
		
		if(x=='1' || x=='8') {
			num -= 3;
		}
		if(x=='2' || x=='7') {
			num -= 2;
		}
		if(y=='a' || y=='h') { 
			num -= 3;
		}
		if(y=='b' || y=='g') {
			num -= 2;
		}
		
		System.out.println(num);
		
	}

}
