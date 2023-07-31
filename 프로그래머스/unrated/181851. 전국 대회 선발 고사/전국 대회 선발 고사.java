import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
       
        ArrayList<Integer> list = new ArrayList<>();
    
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]==true) list.add(rank[i]);
        }
        
        int[] tmp = new int[3];
        
        for(int i = 0; i < tmp.length; i++){
            int min = list.get(0);
            for(int j = 1; j < list.size(); j++){
                min = Math.min(min,list.get(j));
            }
            tmp[i] = min;
            list.remove(list.indexOf(min));
        }
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        for(int i = 0; i < rank.length; i++){
            if(tmp[0] == rank[i]) a = i;
            else if(tmp[1] == rank[i]) b = i;
            else if(tmp[2] == rank[i]) c = i;
        }
        
        int answer = 10000*a + 100*b + c;
        return answer;
    }
}