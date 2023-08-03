class Solution {
    public long solution(long n) {
        long answer = 0;
        long findNum = 1;
        String check = "";
        
        while(findNum <= n){
            if(n== (long)Math.pow(findNum,2)) {
                check = "Yes";
                break;
            }
            findNum++;
        }
        
        if(check.equals("Yes")) answer = (long)Math.pow(findNum+1,2);
        else answer = -1;
            
        return answer;
    }
}