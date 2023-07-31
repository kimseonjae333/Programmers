class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i = 0; i < strArr.length; i++){
            String str = strArr[i];
            String output = "";
            for(int j = 0; j < str.length(); j++){
                char ch;
                if(i == 0 || i % 2 == 0){
                    ch = str.charAt(j);
                    output += str.valueOf(ch).toLowerCase();
                } else {
                    ch = str.charAt(j);
                    output += str.valueOf(ch).toUpperCase();
                }
                answer[i] = output;
            }  
        }
        
        return answer;
    }
}