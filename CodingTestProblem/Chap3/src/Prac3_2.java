import java.util.Arrays;
import java.util.Scanner;

public class Prac3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //배열에 들어갈 숫자의 개수
		int m = scan.nextInt(); //숫자를 더할 횟수
		int k = scan.nextInt(); //반복가능한 횟수 
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		int first = arr[arr.length-1];
		int second = arr[arr.length-2];
		
		int cnt = (m/(k+1)) * k; //k번을 초과하여 더할  수 없기 때문에 k+1씩 반복
		cnt += (m%(k+1)); // m이 k+1로 나누어 떨어지지 않는 경우
		
		int result = 0;
		result += first * cnt;
		result += second*(m-cnt);
		System.out.println(result);
	}

}
