class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
        int index = 0;

        while(count <= k) { 
            index += 2;
            count++;
            
            if(index>numbers.length-1) {
                index = 0 + (index - numbers.length);
            }
            if(count==(k-1)){
                answer = numbers[index];
            }
        }
        
        return answer;
        
    }
}