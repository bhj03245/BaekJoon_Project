/*
�޸������̼�(Memoization)����� ����� ���̳��� ���α׷��� 
�޸������̼��� ���̳��� ���α׷����� �����ϴ� ��� �� �� ������,
�� �� ���� ����� �޸� ������ �޸��� �ΰ� ���� ���� �ٽ� ȣ���ϸ� �޸��� ����� �״�� �������� ����� �ǹ��Ѵ�.
�Ǻ���ġ�Լ��� ��������� ����(ž �ٿ� ���)
ū ������ �ذ��ϱ����� ���� ������ ȣ���Ѵٰ� �Ͽ� ž�ٿ� ����̶�� �Ѵ�. 
����Լ��� ����ϸ� ��ǻ�� �ý��ۿ����� �Լ��� �ٽ� ȣ������ �� 
�޸� �� ����Ǵ� �Ϸ��� ������ ����� �ϹǷ� ������尡 �߻��� �� �ִ�. 
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
