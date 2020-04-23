#include <stdio.h>

int main(void) {
	int burger[3] = { 0 };
	int drink[2] = { 0 };
	int min_b = 2001;
	int min_d = 2001;
	int min = 0;
	for (int i = 0; i < 3; i++) {
		scanf("%d", &burger[i]);
		if (burger[i] < min_b) {
			min_b = burger[i];
		}
	}

	for (int j = 0; j < 2; j++) {
		scanf("%d", &drink[j]);
		if (drink[j] < min_d) {
			min_d = drink[j];
		}
	}
	min = min_b + min_d;
	printf("%d", min - 50);
	
	return 0;
}