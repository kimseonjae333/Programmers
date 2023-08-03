import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(true){
            int tmp = n%x;
            if(tmp==1){
                arr.add(x);
                break;
            }
            x++;
        }
        
        int max = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i)>max) max = arr.get(i);
        }
        
        answer = max;
        
        return answer;
    }
}