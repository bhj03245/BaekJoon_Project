import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Price {
	public static int n;
	public static ArrayList<Integer> arr = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int result = 1;
		
		for(int i=0;i<n;i++) {
			arr.add(scan.nextInt());
		}
		
		Collections.sort(arr);
		
		for(int i=0;i<n;i++) {
			 // ���� �� ���� �ݾ��� ã���� �� �ݺ� ����
            if (result < arr.get(i)) break;
            result += arr.get(i);
		}
		
		System.out.println(result);
	}

}
