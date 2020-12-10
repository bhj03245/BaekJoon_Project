
public class factorialPr {
	public static int factorialIterative(int n) {
		int result = 1;
		for(int i=1;i<=n;i++) {
			result *= i;
		}
		return result;
	}
	
	public static int factorialRecursive(int n) {
		if(n<=1) return 1;
		return n * factorialRecursive(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ݺ������� ���丮�� ����: " + factorialIterative(5));
		System.out.println("��������� ���丮�� ����: " + factorialRecursive(5));
	}

}
