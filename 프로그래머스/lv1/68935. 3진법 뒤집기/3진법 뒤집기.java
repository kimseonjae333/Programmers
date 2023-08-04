import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String strn = new StringBuilder(Integer.toString(n,3)).reverse().toString();

        answer = Integer.parseInt(strn,3);
        
        return answer;
    }
}