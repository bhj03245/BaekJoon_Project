#include <stdio.h>

int d(int n) {
	int result = n;
	while (n != 0) {
	result += n % 10;
	n = n / 10;
	}
	return result;
}

int main() {
	int n = 0;
	int arr[10001];
	arr[0] = 1;

	for (int i = 1; i < 10000; i++) {
		arr[i] = arr[i - 1] + 1;
	}

	for (int j = 0; j < 10000; j++) {
		if (arr[j] != 0) {
			n = j + 1;
			while (n <= 10000) {
				n = d(n);
				if (n <= 10000)
					arr[n - 1] = 0;
			}
		}
	}
		for (int j = 0; j < 10000; j++) {
			if (arr[j] != 0) {
				printf("%d\n", arr[j]);
			}
		}
		return 0;
}