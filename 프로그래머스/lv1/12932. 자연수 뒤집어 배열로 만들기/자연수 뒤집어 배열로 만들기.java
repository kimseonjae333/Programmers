import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] tmp = str.split("");
        
        Stack<String> list = new Stack<>();
        for(int i = 0; i < tmp.length; i++){
            list.push(tmp[i]);
        }     
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < tmp.length; i++){
            answer[i] = Integer.parseInt(list.pop());
        }
        return answer;
    }
}