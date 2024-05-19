#include <stdio.h>
int main(void){
    int kin,que,lok,bis,kni,pon;
    scanf("%d %d %d %d %d %d",&kin,&que,&lok,&bis,&kni,&pon);
    kin = 1-kin;
    que = 1-que;
    lok = 2-lok;
    bis = 2-bis;
    kni = 2-kni;
    pon = 8-pon;
    printf("%d %d %d %d %d %d",kin,que,lok,bis,kni,pon);
}