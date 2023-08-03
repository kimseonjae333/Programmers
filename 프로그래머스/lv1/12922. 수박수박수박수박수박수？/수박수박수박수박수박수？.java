class Solution {
    public String solution(int n) {
        String answer = "수";
        String s1 = "수";
        String s2 = "박";
        
        for(int i = 0; i < n-1; i++){
            if((answer.substring(answer.length()-1, answer.length())).equals("수")) answer += s2;
            else answer += s1;
        }
       
        return answer;
    }
}