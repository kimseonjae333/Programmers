class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        answer = (int)Math.round(fac(balls)/(fac(balls-share)*fac(share)));
        return answer;
    }
    
    static double fac(int a){
        double result = 1;
        while(a>0){
            result *= a;
            a--;
        }
        return result;
    }
}