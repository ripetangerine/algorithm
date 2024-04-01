#include <stdio.h>
int main(){
    int A,B,C;
    scanf("%d %d %d",&A,&B,&C);
    printf("%d\n",(A+B)%C);
    printf("%d\n",((A%C) + (B%C))%C);
    printf("%d\n",(A*B)%C);
    printf("%d\n",((A%C)*(B%C))%C);
    return 0;
}
//출력에 줄바꿈이 있다. 
/*(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?*/
//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.