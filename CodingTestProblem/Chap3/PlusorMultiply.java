import java.util.Scanner;

public class PlusorMultiply {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		int result = s.charAt(0) - '0';
		
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)-'0' == 0 || result == 0) {
				result += s.charAt(i) - '0';
			}
			else {
				result *= s.charAt(i) - '0';
			}
		}
		
		System.out.println(result);

	}

}
