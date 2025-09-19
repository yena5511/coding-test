class Solution {
    public String solution(String s) {
        
        int le = s.length();
        
        String answer = "";
        
        if(le % 2 == 0){
            answer = s.substring(le/2-1,le/2+1);
        }
        else if (le % 2 == 1){
            answer = s.substring(le/2,le/2+1);
        }
        return answer;
    }
}