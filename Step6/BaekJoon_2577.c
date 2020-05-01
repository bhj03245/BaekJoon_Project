#include <stdio.h>

int main(void) {
	int a, b, c, total, rest;
	int num[10] = { 0, };
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);
	total = a * b * c;
	
	while (total > 0) {
		rest = total % 10;
		num[rest] = num[rest]+ 1;
		total = total / 10;
	}
	
	for (int i = 0; i < 10; i++) {
		printf("%d\n", num[i]);
	}
	return 0;
}