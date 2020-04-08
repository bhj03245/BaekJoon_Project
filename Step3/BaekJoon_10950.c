#include <stdio.h>

int main(void)
{
	int t,x;
	int a, b;
	scanf("%d", &t);
	for (x = 0; x < t; x++) {
		scanf("%d", &a);
		scanf("%d", &b);
		printf("%d \n", a + b);
	}
	return 0;
}