/*
메모이제이션(Memoization)기법을 사용한 다이나믹 프로그래밍 
메모이제이션은 다이나믹 프로그래밍을 구현하는 방법 중 한 종류로,
한 번 구한 결과를 메모리 공간에 메모해 두고 같은 식을 다시 호출하면 메모한 결과를 그대로 가져오는 기법을 의미한다.
피보나치함수를 재귀적으로 구현(탑 다운 방식)
큰 문제를 해결하기위해 작은 문제를 호출한다고 하여 탑다운 방식이라고 한다. 
재귀함수를 사용하면 컴퓨터 시스템에서는 함수를 다시 호출했을 때 
메모리 상에 적재되는 일련의 과정을 따라야 하므로 오버헤드가 발생할 수 있다. 
*/

public class TopDown_Dynamic {
	public static long[] d = new long[100];
	
	public static long fibonacci(int x) {
		if(x==1 || x==2) return 1;
		if(d[x] != 0) return d[x];
		d[x] = fibonacci(x-1) + fibonacci(x-2);
		return d[x];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(50));
	}

}
