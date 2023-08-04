class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        String rs = s.toLowerCase();
        
        if(rs.length()==4||rs.length()==6){
            char[] ch = rs.toCharArray();
            for(char c : ch){
                if(97<=c&&c<=122) answer = false;
            }
        } else {
            answer = false;
        }
        return answer;
    }
}