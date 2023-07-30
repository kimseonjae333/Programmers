import java.util.ArrayList;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] nums = String.valueOf(x).split("");
        int sum = 0; 
        for(int i = 0; i < nums.length; i++){
            sum += Integer.parseInt(nums[i]);
        }
        
        if(x%sum != 0) {
            answer = false;
        }
        return answer;
    }
}