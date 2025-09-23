class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int time, cnt, a;
        
        for(int i = 0; i < schedules.length; i++){
            time = 0;
            cnt = 0;
            a = startday;
            for(int j = 0; j < 7; j++ ){
                time = schedules[i] + 10;
                if( time % 100 >= 60){
                    time += 40;
                }
                
                if(timelogs[i][j] <= time){
                    if(a != 7 && a != 6){
                        cnt ++;
                    }
                    
                }
                a = (a % 7) + 1;
            }
            if (cnt >= 5){
                answer++;
            }
        }
        
        return answer;
    }
}