#include <stdio.h>
#include <string.h>
#define MAX 1000001

int main(void) {
	char s[MAX];
	int max, max_index=0;
	int num[26] = { 0. };

	scanf("%s", s);

	for (int i = 0; s[i] != '\0'; i++) {
		if (s[i] < 97) {
			s[i] += 32;
		}
		num[s[i] - 97]++;
	}
	max = num[0];

	for (int i = 1; i < 26; i++) {
		if (max < num[i]) {
			max = num[i];
			max_index = i;
		}
		else if (max == num[i] && num[i] != 0) {
			max_index = -1;
		}
	}

	if (max_index == -1) {
		printf("?\n");
	}
	else {
		printf("%c", 65 + max_index);
	}
	return 0;
}