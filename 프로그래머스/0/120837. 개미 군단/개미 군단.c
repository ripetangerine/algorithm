#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int hp) {
    int jan = hp/5;
    int bun = (hp-jan*5)/3;
    int ill = hp-(jan*5+bun*3);
    
    return jan+bun+ill;
}