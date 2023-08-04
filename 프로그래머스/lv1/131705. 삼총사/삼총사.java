class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        //(num1,num2,num3)
        for(int i = 0; i < number.length-2; i++){ //i는 num1 자리 고정, j와 k를 위해 최대 2까지만 가능
            for(int j = i+1; j < number.length-1; j++){
                for(int k = j+1; k < number.length; k++){
                    int num1 = number[i];
                    int num2 = number[j];
                    int num3 = number[k];
                    
                    if(num1+num2+num3==0) answer++;
                }
            }
        }
        return answer;
    }
}