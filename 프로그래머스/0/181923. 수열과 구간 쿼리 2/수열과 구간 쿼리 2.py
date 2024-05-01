def solution(arr, queries):
    answer = []
    for i in range(len(queries)):
        s= queries[i][0]
        e = queries[i][1]
        k = queries[i][2]
        a = 1000001
        for j in range(s, e+1):
            if arr[j] > k:
                if arr[j]<a:
                    a = arr[j]
        if a == 1000001 :
            a = -1
        answer.append(a)
    return answer