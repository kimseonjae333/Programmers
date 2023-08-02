class Solution {
    public int solution(String s) {
        String tmp [] = s.split(" ");
        
        int answer = 0;
        for(int i = 0; i < tmp.length; i++){
            if(i>0 && tmp[i].equals("Z")){
                answer -= Integer.parseInt(tmp[i-1]);
            } else {
                answer += Integer.parseInt(tmp[i]);
            }
        }
        
        return answer;
    }
}