import java.util.Scanner;

public class ReverseOrder {

	public static String s;
	public static int count0 = 0;
	public static int count1 = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		s = scan.next();
		
		if(s.charAt(0) == '1') {
			count0 += 1;
		}
		else {
			count1 += 1;
		}
		
		for(int i = 0;i<s.length()-1;i++) {
			if(s.charAt(i) != s.charAt(i+1)) {
				if(s.charAt(i+1) == '1') {
					count0 += 1;
				}
				else {
					count1 += 1;
				}
			}
		}
		
		System.out.println(Math.min(count1, count0));
	}

}
