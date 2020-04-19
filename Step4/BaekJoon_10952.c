#include <stdio.h>

int main(void) {
	int a, b;
	while (1) {
		scanf("%d", &a);
		scanf("%d", &b);
		if (a == 0 && b == 0) {
			break;
		}
		else {
			printf("%d \n", a + b);
		}
	}
	return 0;
}