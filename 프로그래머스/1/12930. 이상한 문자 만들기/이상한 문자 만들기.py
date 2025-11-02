def solution(s):
    answer = ''
    
    arr = list(s.split(" ",-1))
    
    for index, i in enumerate(arr):
        for inx,j in enumerate(i):
            if inx % 2 == 0:
                answer += j.upper()
            else:
                answer += j.lower()
        if index < len(arr)-1:
            answer += ' '
        
    return answer