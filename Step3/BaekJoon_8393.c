#include <stdio.h>

int main(void) {
	int n;
	int sum = 0;
	scanf("%d", &n);
	for (int x = 0; x <= n; x++) {
		sum += x;
	}
	printf("%d", sum);
}