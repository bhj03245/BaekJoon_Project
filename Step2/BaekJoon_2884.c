#include <stdio.h>

int main(void) {
	int hour, minute;
	scanf("%d %d", &hour, &minute);

	if (minute - 45 >= 0)
		printf("%d %d", hour, minute - 45);
	else if (minute - 45 < 0) {
		if (hour == 0) {
			hour = 23;
			printf("%d %d", hour, (minute + 60) - 45);
		}
		else {
			printf("%d %d", hour - 1, (minute + 60) - 45);
		}
	}

	return 0;
}