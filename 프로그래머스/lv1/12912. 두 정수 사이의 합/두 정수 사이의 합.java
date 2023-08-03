import java.util.*;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b) answer = a;
        else {
            long max = Math.max(a,b);
            long min = Math.min(a,b);
            
            ArrayList<Long> arr = new ArrayList<>();
            for(long i = min; i <= max; i++){
                arr.add(i);
            }
            
            for(int i = 0; i < arr.size(); i++){
                answer += arr.get(i);
            } 
        }
       
        return answer;
    }
}