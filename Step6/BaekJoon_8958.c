#include <stdio.h>
#include <string.h>

int main(void) {
	int n, sum, score;
	char OX[80];

	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%s", &OX);
		sum = 0;
		score = 1;
		for (int j = 0; j < strlen(OX); j++) {
			if (OX[j] == 'O') {
				sum += score;
				score++;
			}
			else {
				score = 1;
			}
		}
			printf("%d \n", sum);
	}
		return 0;
}