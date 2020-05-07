#include <stdio.h>

int main(void) {
	int c, n;
	scanf("%d", &c);
	for (int i = 0; i < c; i++) {
		int sum = 0, count = 0;
		double average;
		int score[1000];
		scanf("%d", &n);
		for (int j = 0; j < n; j++) {
			scanf("%d", &score[j]);
			sum += score[j];
		}

		average = (double)sum / n;

		for (int j = 0; j < n; j++) {
			if (score[j] > average) {
				count++;
			}
		}
		printf("%.3f%%\n", (float)count*100 / n);
	}
	return 0;
}