#include <stdio.h>
#include <math.h>

int main() {
    int number;
    scanf("%d", &number);

    // 2로 계속 나누기
    while (number % 2 == 0) {
        printf("2\n");
        number /= 2;
    }

    // 3 이상 홀수로 나누기
    for (int i = 3; i <= sqrt(number); i += 2) {
        while (number % i == 0) {
            printf("%d\n", i);
            number /= i;
        }
    }

    // 마지막으로 남은 소수 출력
    if (number > 2) {
        printf("%d\n", number);
    }

    return 0;
}
