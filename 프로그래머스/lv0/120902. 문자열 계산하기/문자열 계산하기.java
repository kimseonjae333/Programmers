class Solution {
    public int solution(String my_string) {
        String[] tmp = my_string.split(" ");
        
        String operator = "";
        int answer = Integer.parseInt(tmp[0]);
        
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i].equals("+")) operator = "+";
            else if(tmp[i].equals("-")) operator = "-";
            else {
                if(Integer.parseInt(tmp[i])>0 && Integer.parseInt(tmp[i])<=20000){
                    int num = Integer.parseInt(tmp[i]);
                    if(operator.equals("+")) answer += num;
                    else if(operator.equals("-")) answer -= num;
                } 
            }
        }
        return answer;
    }

}