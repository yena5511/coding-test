class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 0;
        int min = 0;
        int a = n * m;
        
        for(int i = 1; i <= a; i++){
            if(i % n == 0 && i % m == 0){
                max = i;
            }
            if (max != 0)
                break;
        }
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0 && m % i == 0){
                min = i;  
            }
        }

        answer[0] = min;
        answer[1] = max;
        
        
        return answer;
    }
}