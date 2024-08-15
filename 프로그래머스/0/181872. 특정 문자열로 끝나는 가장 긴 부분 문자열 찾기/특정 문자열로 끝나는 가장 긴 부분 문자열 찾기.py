def solution(myString, pat):
    answer = myString.rfind(pat)
    return myString[:answer+len(pat)]