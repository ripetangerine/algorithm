#include <iostream>
int main(){
    int charNum;
    std::cin >> charNum;
    char *strSet = (char*)malloc(charNum);
    std::cin >> strSet;
    
  //  scanner == cin 
    
    for(int i=charNum-5; i<charNum; i++){
        std::cout << strSet[i];
    }
    return 0;
}