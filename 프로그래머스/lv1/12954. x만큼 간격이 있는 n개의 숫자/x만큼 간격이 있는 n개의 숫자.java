class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        long orginX = x;
        answer[0] = orginX;
        
        for(int i = 1; i < n; i++){
            orginX += x;
            answer[i] = orginX;
        }  
        return answer;
    }
}