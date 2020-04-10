#include <stdio.h>

int main(void) {
	int t,a,b;
	scanf("%d", &t);

	for (int x = 0; x < t; x++) {
		scanf("%d", &a);
		scanf("%d", &b);
		printf("%d \n", a + b);
	}
	return 0;
}