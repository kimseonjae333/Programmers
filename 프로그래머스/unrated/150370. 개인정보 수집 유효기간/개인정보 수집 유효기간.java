import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
       
        int year = Integer.parseInt(today.substring(0,4));
        int month = Integer.parseInt(today.substring(5,7));
        int day = Integer.parseInt(today.substring(8,10));
        
        int total = year*12*28 +month*28 +day;
        
        HashMap<String, Integer> term = new HashMap<>();
        for(int i = 0; i < terms.length; i++){
            String[] tmp = terms[i].split(" ");
            term.put(tmp[0],Integer.parseInt(tmp[1]));
        }
        
        for(int i = 0; i < privacies.length; i++){
            String[] tmp = privacies[i].split(" ");
            
            int yearP = Integer.parseInt(tmp[0].substring(0,4));
            int monthP = Integer.parseInt(tmp[0].substring(5,7));
            int dayP = Integer.parseInt(tmp[0].substring(8,10));
            
            int totalP = yearP*12*28 +monthP*28 +dayP;
            
            int m = term.get(tmp[1]);
            
            totalP = totalP + m*28;
            
            if(total >= totalP){
                answer.add(i+1);
            }
        }
        
        return answer;
    }
}