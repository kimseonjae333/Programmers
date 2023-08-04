class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int sumX = 0;
        int sumY = 0;
        
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0; i < arr1.length; i++){
            if(arr1[0].length!=1){
                for(int j = 0; j < arr1[0].length-1; j++){
                    sumX = arr1[i][j] + arr2[i][j];
                    sumY = arr1[i][j+1] + arr2[i][j+1];
                    answer[i][j] = sumX;
                    answer[i][j+1] = sumY;
                }
            } else {
                for(int j = 0; j < arr1[0].length; j++){
                    sumX = arr1[i][j] + arr2[i][j];
                    answer[i][j] = sumX;
                }
            }  
        }
       
        return answer;
    }
}