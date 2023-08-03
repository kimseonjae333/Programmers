import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int curNum = 0;
        
        for(int i = left; i <= left+(right-left); i++){
            curNum = i;
            ArrayList<Integer> arr = new ArrayList<>();
            int num = 1;
            
            while(num<=curNum){
                if(num==1||curNum%num==0) arr.add(num);
                num++;
            }

            if(arr.size()%2==0) answer += curNum;
            else answer -= curNum;
        }
        return answer;
    }
}