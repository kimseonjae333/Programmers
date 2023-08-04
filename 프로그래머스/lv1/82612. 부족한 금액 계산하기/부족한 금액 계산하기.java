class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int originP = price;
        long doubleP = 0;
        
        for(int i = 0; i < count; i++){
            doubleP += price;
            price += originP;
        }
        
        if(money-doubleP>=0) answer = 0;
        else {
             answer = Math.abs(money - doubleP);
        }
      
        return answer;
    }
}