#include <stdio.h>

int main(void) {
	int n;
	int num1, num2, num3, num4, result;
	int cnt = 0;
	scanf("%d", &n);
	result = n;
	while (1) {
		num1 = n / 10;
		num2 = n % 10;
		num3 = (num1 + num2) % 10;
		num4 = (num2 * 10) + num3;
		n = num4;
		cnt++;
		if (result == num4) {
			break;
		}
	}
	printf("%d \n", cnt);
	return 0;
}