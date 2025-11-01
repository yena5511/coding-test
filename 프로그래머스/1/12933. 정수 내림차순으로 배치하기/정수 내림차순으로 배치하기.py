def solution(n):
    
    arr = sorted(str(n))
    arr.reverse()
    return int((''.join(arr)))