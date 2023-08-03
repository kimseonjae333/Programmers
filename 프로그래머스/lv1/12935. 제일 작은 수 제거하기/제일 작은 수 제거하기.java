import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int index = 0;
        
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
            if(arr[i]<min) {
                min = arr[i];
                index = i;
            }
        }
           
        list.remove(index);
        
        if(list.size()==0) {
            list.add(-1);
         }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}