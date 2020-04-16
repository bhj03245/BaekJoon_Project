#include <stdio.h>

int main(void) {
	int n,x,y;
	scanf("%d", &n);

	for (x = 1; x <= n; x++) {
		for (y = 1; y <= x; y++) {
			printf("*");
		}
		printf("\n");
	}
	return 0;

}