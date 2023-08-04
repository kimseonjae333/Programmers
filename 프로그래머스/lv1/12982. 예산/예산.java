import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d); 
        //신청예산이 작은 부서부터 주면 최대한 많은 부서 줄수있음
        for(int i = 0; i < d.length; i++){
            if(budget<d[i]){
                break;
            } else { 
                budget -= d[i];
                answer++;
            }
        }
        
        return answer;
    }
}