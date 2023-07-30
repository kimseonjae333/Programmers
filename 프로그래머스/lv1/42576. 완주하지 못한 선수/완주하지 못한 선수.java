import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> p = new HashMap<>();
        
        for(String name : participant){
            p.put(name, p.getOrDefault(name, 0) + 1);
        }
        
        for(String name : completion){
            p.put(name, p.get(name) - 1);
        }
        
        for(String name : p.keySet()){
            if(p.get(name) > 0){
                answer = name;
            }
        }
        return answer;
    }
}