import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String rs = s.toLowerCase();
 
            HashMap<String,Integer> map = new HashMap<>();
            String[] strlist = rs.split("");
            
            for(String str : strlist){
                map.put(str, map.getOrDefault(str, 0)+1);
            } 
            
            int tmp1 = map.getOrDefault("p",0);
            int tmp2 = map.getOrDefault("y",0);
        
            if(tmp1!=tmp2) answer = false; 
   

        return answer;
    }
}