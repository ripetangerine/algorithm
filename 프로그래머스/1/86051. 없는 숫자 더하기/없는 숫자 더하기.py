def solution(numbers):
    answer = 45
    
    for i in range(len(numbers)):
        answer -= numbers[i]
    
    return answer