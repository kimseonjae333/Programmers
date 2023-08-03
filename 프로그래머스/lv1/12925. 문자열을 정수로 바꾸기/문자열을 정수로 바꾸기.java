class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String rs = s.substring(1);
        
        if(s.substring(0,1).equals("+")){
            answer = Integer.parseInt(s.substring(1));
        } else if(s.substring(0,1).equals("-")){
            answer = Integer.parseInt(s.substring(0));
        } else {
            answer = Integer.parseInt(s.substring(0));
        }
        
        
        return answer;
   
    }
}