import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if(n==1){
            answer = Arrays.copyOfRange(num_list,0,b+1);
        } else if(n==2){
            answer = Arrays.copyOfRange(num_list,a,num_list.length);
        } else if(n==3){
            answer = Arrays.copyOfRange(num_list,a,b+1);
        } 
        else{
            int[] tmp = Arrays.copyOfRange(num_list,a,b+1);
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            
            for(int i = 0; i < tmp.length; i+=c){
                System.out.print(tmp[i]);
                arr.add(tmp[i]);
            }
            
            answer = new int[arr.size()];
            for(int i = 0; i <arr.size(); i++){
                answer[i] = arr.get(i);
            }
            
        }
        return answer;
    }
}