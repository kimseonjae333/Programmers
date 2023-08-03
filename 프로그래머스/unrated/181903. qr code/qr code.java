import java.util.*;

class Solution {
    public String solution(int q, int r, String code) {
        String[] strlist = code.split("");
        
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < code.length(); i++){
            if(i%q==r){
                arr.add(i);
            }
        }
        
        String answer = "";
        for(int i = 0; i < arr.size(); i++){
           answer += strlist[arr.get(i)];
        }
       
        return answer;
    }
}