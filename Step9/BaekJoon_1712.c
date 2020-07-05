#include <stdio.h>

int main(void) {
	int a, b, c, cnt=0, chk=0; //a는 고정 비용 b는 가변비용 c는 한대 당 가격
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);

	if (c <= b) {
		printf("-1");
	}
	else {
		printf("%d", a / (c - b) + 1);
	}

}