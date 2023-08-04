import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long intP = Long.parseLong(p);
        
        for(int i = 0; i < (t.length()-p.length()+1); i++){
            //System.out.println(Integer.parseInt(t.substring(i,i+p.length())));
            if(Long.parseLong(t.substring(i,i+p.length()))<=intP) answer++;
        }
        
        return answer;
    }
}