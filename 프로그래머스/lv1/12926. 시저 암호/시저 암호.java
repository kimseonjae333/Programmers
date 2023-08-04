class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] ch = s.toCharArray();
        for(char c : ch){
  
            if(65<=c&&c<=90){ //대문자일때
                c+=n;
                if(c>90){
                    int num = c-91;
                    c = (char)(65+num); //65, num은 둘다 정수형이라 형변환 필요
                }
                answer += c;
            }
            else if(97<=c&&c<=122){ //소문자일때
                c+=n;
                
                if(c>122){
                    int num = c-123;
                    c= (char)(97+num);
                    
                }
                answer += c;
            }
            else{ //공백일때
                answer += " ";
            }
        }
        return answer;
    }
}