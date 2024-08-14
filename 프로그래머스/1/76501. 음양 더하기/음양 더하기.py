def solution(absolutes, signs):

    num = 0
    for i in range(len(absolutes)):
        if signs[i]==False:
            num+= -absolutes[i]
        else :
            num+= absolutes[i]
            
    return num