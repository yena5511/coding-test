def solution(sizes):
    answer = 0
    
    return max(max(x) for x in sizes) * max(min(x) for x in sizes)