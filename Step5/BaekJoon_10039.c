#include <stdio.h>

int main(void) {
	int score;
	int i, average;
	int sum = 0;

	for (i = 0; i < 5; i++) {
		scanf("%d", &score);
		if (score < 40) {
			score = 40;
		}
		sum += score;
	}
	average = (int)sum / 5;
	printf("%d \n", average);

	return 0;
}