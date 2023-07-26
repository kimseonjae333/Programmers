import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++){
            if(n%i == 0) {
                arr.add(i);
            }        
        }
        
        int answer = 0;
        for(int i = 0; i < arr.size(); i++){
            answer += arr.get(i);
        }
        return answer;
    }
}