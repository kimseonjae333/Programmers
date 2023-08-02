class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            String str = String.valueOf(array[i]);
            
            String[] s = str.split("");
            for(int j = 0; j < s.length; j++){
                if(s[j].equals("7")) answer++;
            }
        }
        return answer;
    }
}