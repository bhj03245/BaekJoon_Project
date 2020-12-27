
//단순히 재귀함수를 이용하여 구현한 피보나치 수열 수행시간이 기하급수적으로 늘어나 효율적이지 못하다.
public class Fibonacci {
	public static int fibonacci(int x) {
		if (x==1 || x==2) return 1;
		return fibonacci(x -1) + fibonacci(x - 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(10));
	}

}
