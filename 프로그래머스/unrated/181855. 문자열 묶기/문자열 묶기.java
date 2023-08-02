import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> nums = new HashMap<>();
        
        for(int i = 0; i < strArr.length; i++){
            int len = strArr[i].length();
            
            nums.put(len, nums.getOrDefault(len,0)+1);
        }
        
        int max = 0;
        for(int value : nums.values()){
                if(value > max) {
                    max = value;
                    answer = max;
                } 
        }
        
        return answer;
    }
}