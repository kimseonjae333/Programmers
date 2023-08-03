import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String strA = String.valueOf(n);
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i < strA.length(); i++){
            arr.add(strA.substring(i,i+1));
        }
        Collections.sort(arr, Collections.reverseOrder());

        strA = "";
        for(int i = 0; i < arr.size(); i++){
            strA += arr.get(i);
        }
        
        answer = Long.parseLong(strA);
        
        return answer;
    }
}