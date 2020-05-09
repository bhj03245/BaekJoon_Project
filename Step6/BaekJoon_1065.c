#include <stdio.h>

int iso(int n) {
	int num1=0, num2=0, num3=0;
	int cnt = 0;
	if (n >= 100 && n <= 1000) {
		num1 = n / 100;
		num2 = (n % 100) / 10;
		num3 = n % 10;
		if (num1 - num2 == num2 - num3)
			cnt=1;
	}
	else if (n < 100) {
		num1 = n / 10;
		num2 = n % 10;
		cnt=1;
	}
	return cnt;
}

int main(void) {
	int n,count =0;
	int num[1000];
	scanf("%d", &n);
	for (int i = 1; i <= n; i++) {
		num[i] = i;
		count += iso(num[i]);
	}
	printf("%d", count);
	return 0;
}