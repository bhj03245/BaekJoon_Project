#include <stdio.h>

int main(void) {
	int n, i=1, tmp=1;
	scanf("%d", &n);
	while (1) {
		if (n <= tmp) {
			printf("%d", i);
			break;
		}
		else {
			tmp += 6 * i;
			i++;
		}
	}
	return 0;

}