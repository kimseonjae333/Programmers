class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        int index = 0;
        
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(" ")){
                index = -1;
            } else {
                if(index%2==0){
                    str[i] = str[i].toUpperCase();
                } else {
                    str[i] = str[i].toLowerCase();
                }
            }
            index++;
        }
            
        for(int i = 0; i < str.length; i++){
            answer += str[i];
        }

        return answer;
    }
}