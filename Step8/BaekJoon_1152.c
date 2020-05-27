#include <stdio.h>
#include <string.h>
#define MAX 1000001

int main(void) {
	char string[MAX];
	int cnt=1;

	gets(string); //문자열 입력받을 때엔 gets
	int len = strlen(string);

	for (int i = 0; string[i]!=NULL; i++) {
		if (string[i] == ' ') {
			cnt++;
		}
		if (string[i] == ' ' && string[i + 1] == '\0') {
			cnt--;
		}
	}

	if (string[0] == ' ') {
		cnt--;
	}

	printf("%d", cnt);
	return 0;
}