import java.util.*;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]==true) arr.add(absolutes[i]);
            else arr.add(absolutes[i]*-1);
        }
        
        for(int i = 0; i < arr.size(); i++){
            answer += arr.get(i);
        }
        
        return answer;
    }
}