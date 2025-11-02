def solution(s):
    
    for i in s:
        if i.isalpha():  
            return False
    return True if len(s)==4 or len(s)==6 else False
