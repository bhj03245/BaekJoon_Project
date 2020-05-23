#include <stdio.h>
#include <string.h>

int main(void) {
	char s[101];
	int arr[26];

	scanf("%s", s);

	for (int i = 0; i < 26; i++) {
		arr[i] = -1;
	}

	for (int i = 0;i<strlen(s); i++) {
		if (arr[s[i] - 97] == -1) {
			arr[s[i] - 97] = i;
		}
	}

	for (int i = 0; i < 26; i++) {
		printf("%d ", arr[i]);
	}

	return 0;
}