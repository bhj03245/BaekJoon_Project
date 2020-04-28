#include<stdio.h>
int main() {
	int num, i, j;
	scanf("%d", &num);
	for (i = 0; i < num * 2; i++) {//2*nÇà 
		if (i % 2 == 0) {
			for (j = 0; j < num; j++) {
				if (j % 2 == 0)
					printf("*");
				else
					printf(" ");
			}
		}
		if (i % 2 == 1) {
			for (j = 0; j < num; j++) {
				if (j % 2 == 1)
					printf("*");
				else
					printf(" ");
			}
		}
		printf("\n");
	}
	return 0;
}