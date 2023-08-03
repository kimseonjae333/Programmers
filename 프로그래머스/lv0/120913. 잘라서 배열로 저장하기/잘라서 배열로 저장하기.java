import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> arr = new ArrayList<>();
        
        String[] tmp = my_str.split("");
        String str = "";
        for(int i = 0; i < tmp.length; i++){
            if(arr.size()==(tmp.length/n)){
                str += tmp[i];
                if(i==tmp.length-1) arr.add(str);
                continue;
            }
            str += tmp[i];
            if(str.length()==n){
                arr.add(str);
                str = "";
            }
        }
        
        String[] answer = new String[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}