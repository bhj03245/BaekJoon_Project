#include <stdio.h>

int main(void) {
	int a, b, x, t;
	scanf("%d", &t);
	for (x = 1; x <= t; x++) {
		scanf("%d", &a);
		scanf("%d", &b);
		printf("Case #%d: %d\n", x, a + b);
	}
	return 0;
}