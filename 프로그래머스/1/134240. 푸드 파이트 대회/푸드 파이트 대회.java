class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i = 1; i<food.length; i++){
            for(int j = 1; j<=food[i]/2; j++){
                answer += Integer.toString(i);
            }
        }
        
        String re = "";
        
        for (int i = answer.length() -1 ; i>=0; i--){
            re += answer.charAt(i);
        }
        
        answer += "0" + re;
        return answer;
    }
}