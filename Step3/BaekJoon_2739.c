#include <stdio.h>

int main(void) {
	int n , a;
	int x;
	scanf("%d", &n);
	for (x=1; x<10; x++) {
		a = n * x;
		printf("%d * %d = %d \n", n, x, a);
	}
	return 0;
}