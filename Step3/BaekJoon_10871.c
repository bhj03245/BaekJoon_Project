#include <stdio.h>

int main(void) {
	int n, x;
	int* num;
	scanf("%d", &n);
	scanf("%d", &x);
	num = (int*)malloc(sizeof(int) * n);
	for (int i = 1; i <= n; i++) {
		scanf("%d", &num[i]);
		if (num[i] < x) {
			printf("%d ", num[i]);
		}
	}
	return 0;
}