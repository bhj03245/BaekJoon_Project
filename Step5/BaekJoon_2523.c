#include <stdio.h>

int main(void) {
	int n, x, y,z;
	scanf("%d", &n);

	for (x = 1; x <= n; x++) {
		for (y = 1; y <= x; y++) {
			printf("*");
		}
		printf("\n");
	}
	for (x = 1; x <= n-1; x++) {
		for (z = n - 1; z >= x; z--) {
			printf("*");
		}
		printf("\n");
	}
	
	return 0;

}