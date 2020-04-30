#include <stdio.h>

int main(void) {
	int n[9] = { 0, };
	int max = 0, maxindex = 0;
	for (int i = 0; i < 9; i++) {
		scanf("%d", &n[i]);
		if (max < n[i]) {
			max = n[i];
			maxindex = i + 1;
		}
	}

	printf("%d\n", max);
	printf("%d", maxindex);
	return 0;
}