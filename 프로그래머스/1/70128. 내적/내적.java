import java.util.*;
class Solution {
    public int solution(int[] a, int[] b) {
        
        ArrayList<Integer> ls = new ArrayList<>();
        int answer = 0; 
        
        for (int i = 0; i < a.length; i++){
            ls.add(a[i] * b[i]);
        }
        for(int i: ls){
            answer += i;
        }
        
        return answer;
    }
}