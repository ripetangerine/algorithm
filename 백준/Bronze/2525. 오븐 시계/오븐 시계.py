A,B = map(int, input().split())
time = int(input())

A += time // 60
B += time % 60 

if B>=60:
    A+=1
    B-=60    
    
if A>=24:
    A-=24
    
print(A,B)
