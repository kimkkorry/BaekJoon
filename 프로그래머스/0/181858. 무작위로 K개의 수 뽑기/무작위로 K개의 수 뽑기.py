def solution(arr, k):
    answer = []
    for i in range(0, len(arr)):
        if answer.count(arr[i]) == 0:
            answer.append(arr[i])
        if len(answer) == k:
            break
    
    if len(answer)<k:
        a = k - len(answer)
        for i in range(0, a):
            answer.append(-1)
    return answer