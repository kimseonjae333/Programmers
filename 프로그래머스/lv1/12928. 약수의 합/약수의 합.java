import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> yaksu = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                yaksu.add(i);
            }
        }
        
        int answer = 0;
        for(int i = 0; i < yaksu.size(); i++){
            answer += yaksu.get(i);
        }
        
        return answer;
    }
}