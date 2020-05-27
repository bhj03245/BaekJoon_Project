#include <stdio.h>

int main(void) {
	char num1[10];
	char num2[10];
	int n1, n2;
	char temp1 = ' ';
	char temp2 = ' ';

	scanf("%s", num1);
	scanf("%s", num2);

	temp1 = num1[0];
	temp2 = num2[0];

	num1[0] = num1[2];
	num2[0] = num2[2];

	num1[2] = temp1;
	num2[2] = temp2;

	n1 = atoi(num1);
	n2 = atoi(num2);

	if (n1 > n2) {
		printf("%d", n1);
	}
	else if(n1 < n2) {
		printf("%d", n2);
	}

	return 0;
}