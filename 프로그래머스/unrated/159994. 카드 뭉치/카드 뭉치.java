class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int index1 = 0;
        int index2 = 0;
        
        for(int i = 0; i < goal.length; i++){
            String check = goal[i];
         
            if(check.equals(cards1[index1])){
                index1++;
                if(index1 == cards1.length) index1 = 0; 
            } 
            else if(check.equals(cards2[index2])){
                index2++;
                if(index2 == cards2.length) index2 = 0; 
            } else {
                answer ="No";
                break;
            }
            
                
        }
        
        return answer;
    }
}