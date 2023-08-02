import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==2) list.add(i);
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
         
        
        int[] answer;
        if(list.size()==0){
            answer = new int[1];
            answer[0] = -1;
        }
        else if(list.size()==1){
            answer = new int[1];
            answer[0] = 2;
        } else {
            int start = list.get(0);
            int end = list.get(list.size()-1);
            int len = end+1;
            
            answer = Arrays.copyOfRange(arr, start, len);
        }

        return answer;
    }
}