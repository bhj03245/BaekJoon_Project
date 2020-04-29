#include <stdio.h>

int main(void) {
	int n;
	scanf("%d", &n);
	int *num;
	num = (int*)malloc(sizeof(int) * n);
	int max = -1000001;
	int min = 1000001;
	for (int i = 0; i < n; i++) {
		scanf("%d", &num[i]);
	}
	for (int i = 0; i < n; i++) {
		if (max <= num[i]) {
			max = num[i];
		}
		if(min > num[i]){
			min = num[i];
		}
	}
	printf("%d %d", min, max);
	return 0;
}