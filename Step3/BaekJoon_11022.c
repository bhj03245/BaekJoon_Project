#include <stdio.h>

int main(void) {
	int t, x, a, b;
	scanf("%d",&t);
	for (x = 1; x <= t; x++) {
		scanf("%d", &a);
		scanf("%d", &b);
		printf("Case #%d: %d + %d = %d\n", x,a,b,a + b);
	}
	return 0;
}