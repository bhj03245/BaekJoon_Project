#include <stdio.h>

int main(void) {
	int n, max = 0;
	int num[1000];
	double sum = 0, average = 0;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &num[i]);
		if (max < num[i]) {
			max = num[i];
		}
	}

	for (int i = 0; i < n; i++) {
		sum += (double)num[i] / (double)max*100;
	}
	average = (double)sum / n;
	printf("%.2lf", average);
	return 0;
}