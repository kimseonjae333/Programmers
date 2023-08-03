class Solution {
    public long solution(long num) {
        int answer = 0;

        while(num!=1){
            answer++;
            
            if(answer==500){
                answer = -1;
                break;
            } else if(num%2==0){
                num/=2;
            } else {
                num = num*3 + 1;
            }
        }
        
        return answer;
    }
}