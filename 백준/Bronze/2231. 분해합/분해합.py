n = int(input())
answer = 0
for i in range(1, n+1):
    nums = list(map(int, str(i)))
    answer = sum(nums) + i
    if answer == n:
        print(i)
        break
    if i == n:
        print(0)
