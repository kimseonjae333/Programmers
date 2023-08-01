import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i = 0; i < picture.length; i++){
            String[] tmp = picture[i].split("");
            String str = "";
            for(String t : tmp){
                str += t.repeat(k);
            }
            
            for(int j = 0; j < k; j++){
                ans.add(str);
            }     
        }
        
        String[] answer = new String[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            answer[i] = ans.get(i);  
        }
        
        return answer;
    }
}