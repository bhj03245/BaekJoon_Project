#include <stdio.h>

int main(void) {
	int a, b, c, cnt=0, chk=0; //a�� ���� ��� b�� ������� c�� �Ѵ� �� ����
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