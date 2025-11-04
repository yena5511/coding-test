def solution(n, w, num):
    
    h = n//w if n%w == 0 else n//w+1
    
    arr = [[0 for _ in range(w)] for _ in range(h)]
    
    cnt = 1
    
    for i in range(h):
        for j in range(w):
            if cnt > n:
                break
            else:
                arr[i][j] = cnt
            cnt += 1
            
        if i % 2 == 1:
            arr[i].reverse()
    
    for i in range(h):
        for j in range(w):
            if arr[i][j] == num:
                a, b = i, j
    
    answer = 0
    
    for r in range(a, h):
        if arr[r][b] != 0:
            answer += 1

    return answer
