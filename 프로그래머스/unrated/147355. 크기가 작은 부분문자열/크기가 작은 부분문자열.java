import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long intP = Long.parseLong(p); //p의 길이가 int의 범위를 넘어갈 수 있음
        
        for(int i = 0; i < (t.length()-p.length()+1); i++){
            //System.out.println(Integer.parseInt(t.substring(i,i+p.length())));
            if(Long.parseLong(t.substring(i,i+p.length()))<=intP) answer++;
        }
        
        return answer;
    }
}