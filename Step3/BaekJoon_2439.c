#include <stdio.h>

int main(void) {
	int n, x, y, z;
	scanf("%d", &n);

	for (x = 1; x <= n; x++) {
		for (y = n - x; y > 0; y--) {
			printf(" ");
		}
		for (z = 1; z <= x; z++) {
			printf("*");
		}
		printf("\n");
	}
	return 0;

}