#include <stdio.h>
#include <string.h>

int main(void) {
	int t=0, r=0;
	char s[20];
	scanf("%d", &t);

	for (int i = 0; i < t; i++) {
		scanf("%d", &r);
		scanf("%s", s);
		for (int j = 0; j < strlen(s); j++) {
			for (int k = 0; k < r; k++) {
				printf("%c", s[j]);
			}
		}
		printf("\n");
	}
	return 0;
}