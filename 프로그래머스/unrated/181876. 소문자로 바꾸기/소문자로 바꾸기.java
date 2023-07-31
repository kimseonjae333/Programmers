class Solution {
    public String solution(String myString) {
        String[] strlist = myString.split("");
        
        String answer = "";
        for(int i = 0; i < strlist.length; i++){
            char tmp = myString.charAt(i);
            
            if((65 <= tmp) && (tmp <= 90)){
                answer += myString.valueOf(tmp).toLowerCase();
            } else {
                answer += tmp;
            }
            
        }
        
        return answer;
    }
}