import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer,Integer> nums = new HashMap<>();
        
        for(int i = 0; i < array.length; i++){
            nums.put(array[i],nums.getOrDefault(array[i],0)+1);
        }
        int answer = 0;
        int max = 0;
        
        System.out.println(nums);
        
        for(int i = 0; i < array.length; i++){
            if(array[i] != answer){
                if(nums.get(array[i]) > max){
                answer = array[i];
                max = nums.get(array[i]);
                }
                else if(nums.get(array[i])==max){
                    answer = -1;
                }
            }
            
        }        
        
        
        return answer;
    }
}