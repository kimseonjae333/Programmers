import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        int sum = 0;
        for(int i = 0; i < sides.length-1; i++){
            sum += sides[i];
        }
        
        if(sides[sides.length-1]>=sum) answer = 2;
        else answer = 1;
        
        return answer;
    }
}
