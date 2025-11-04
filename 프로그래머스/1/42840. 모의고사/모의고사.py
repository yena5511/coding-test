def solution(answers):

    a = [1,2,3,4,5]
    b = [2,1,2,3,2,4,2,5]
    c = [3,3,1,1,2,2,4,4,5,5]
    
    sum = [0,0,0]
    
    for i,aw in enumerate(answers):
        if a[i % len(a)] == aw:
            sum[0] += 1
        if b[i % len(b)] == aw:
            sum[1] += 1
        if c[i % len(c)] == aw:
            sum[2] += 1     
    
    m = max(sum)
    
    answer = [i+1 for i,a in enumerate(sum) if a == m]
    return answer