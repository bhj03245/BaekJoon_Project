#include <stdio.h>

int main(void) {
	int num1[42] = { 0, };
	int num2, count=0;
	
	for (int i = 0; i < 10; i++) {
		scanf("%d", &num2);
		num1[num2 % 42]++;
	}
	for (int i = 0; i < 42; i++) {
		if (num1[i] != 0)
			count++;
	}
	printf("%d", count);
	return 0;
}
