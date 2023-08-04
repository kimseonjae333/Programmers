import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX = 0;
        int maxY = 0;
        
        for(int i = 0; i < sizes.length; i++){
            int[] size = sizes[i];
            Arrays.sort(size);
            sizes[i][0] = size[0];
            sizes[i][1] = size[1];
            
            if(sizes[i][0]>maxX) {
                maxX = sizes[i][0];
            } 
            if(sizes[i][1]>maxY) {
                maxY = sizes[i][1];
            }
        }
        
        System.out.println(maxX);
        System.out.println(maxY);
            
        answer = maxX*maxY;
        
        return answer;
    }
}