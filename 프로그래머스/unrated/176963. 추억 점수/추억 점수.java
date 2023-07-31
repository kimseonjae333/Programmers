import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            map.put(name[i],yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++){
            String[] tmp = photo[i];
            int[] score = new int[tmp.length];
            int totalScore = 0;
            
            for(int j = 0; j < tmp.length; j++){
                if(!map.containsKey(tmp[j])) map.put(tmp[j],map.getOrDefault(tmp[j], 0));
                score[j] = map.get(tmp[j]);
                totalScore += score[j];
            }
             answer[i] = totalScore;  
        }         
        return answer;
    }
}