def solution(arr):
    answer = []
    answer.append(arr[0])
    i = 1
    while i<len(arr) :
        if i>= len(arr) :
            break
        else:
            if len(answer) == 0:
                answer.append(arr[i])
                i+=1
            else:
                if answer[len(answer) - 1] == arr[i]:
                    answer.pop()
                    i+=1
                elif answer[len(answer) - 1] != arr[i]:
                    answer.append(arr[i])
                    i+=1
    
    if len(answer) == 0:
        answer.append(-1)
    return answer