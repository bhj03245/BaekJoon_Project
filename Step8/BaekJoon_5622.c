#include <stdio.h>
#include <string.h>

int main(void) {

	char s[15];
	scanf("%s", &s);
	int num = 0;
	for (int i = 0; i < strlen(s); i++) {
		if (s[i] == 'A' || s[i] == 'B' || s[i] == 'C') {
			num += 3;
		}
		else if (s[i] == 'D' || s[i] == 'E' || s[i] == 'F') {
			num += 4;
		}
		else if (s[i] == 'G' || s[i] == 'H' || s[i] == 'I') {
			num += 5;
		}
		else if (s[i] == 'J' || s[i] == 'K' || s[i] == 'L') {
			num += 6;
		}
		else if (s[i] == 'M' || s[i] == 'N' || s[i] == 'O') {
			num += 7;
		}
		else if (s[i] == 'P' || s[i] == 'Q' || s[i] == 'R' || s[i] == 'S') {
			num += 8;
		}
		else if (s[i] == 'T' || s[i] == 'U' || s[i] == 'V') {
			num += 9;
		}
		else if (s[i] == 'W' || s[i] == 'X' || s[i] == 'Y' || s[i] == 'Z') {
			num += 10;
		}
	}
	printf("%d", num);
	return 0;
}