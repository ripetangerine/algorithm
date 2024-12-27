/*
1/점 4개 - 한 줄에 2
2/점 9개 - 한 줄에 3 2+1
3/점 25개 - 한 줄에 5 3+2
4/ 점 ?개 - 한 줄에 9  5+4


*/

int main(){
    int oneLineDot = 2;
    int answer;
    int filp;
    scanf("%d",&filp);
    
    for(int i=0; i<filp; i++){
        oneLineDot = oneLineDot + (oneLineDot - 1);
    }
    
    printf("%d",oneLineDot*oneLineDot);
}

