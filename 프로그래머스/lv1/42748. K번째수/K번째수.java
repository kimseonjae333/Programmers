import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int[] tmp = commands[i];
            int start = tmp[0] - 1;
            int end = tmp[1];
            int result = tmp[2] - 1;
            
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = start; j < end; j++){
                arr.add(array[j]);
            }
            
            Collections.sort(arr);
            answer[i] = arr.get(result);
        }
        return answer;
    }
}