import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0; i < players.length; i++){
            map.put(players[i],i);
        }
        
        for(String call : callings){
            int index = map.get(call);
            
            String tmp = "";
            tmp = players[index];
            players[index] = players[index-1];
            players[index-1] = tmp;
            map.put(players[index-1], index-1);
            map.put(players[index], index);
            
        }
        
        String[] answer = new String[map.size()];
        for(int i = 0; i < map.size(); i++){
            answer[i] = players[i];
        }
        return answer;
    }
}