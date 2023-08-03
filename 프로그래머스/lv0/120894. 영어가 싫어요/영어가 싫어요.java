import java.util.*;

class Solution {
    public long solution(String numbers) {
        ArrayList<String> arr = new ArrayList<>();
        
        String[] list = numbers.split("");
        String str = "";
        for(int i = 0; i < list.length; i++){
            str += list[i];
            
            if(str.equals("zero")){
                str = "0";
                arr.add(str);
                str = "";
            } else if(str.equals("one")){
                str = "1";
                arr.add(str);
                str = "";
            } else if(str.equals("two")){
                str = "2";
                arr.add(str);
                str = "";
            } else if(str.equals("three")){
                str = "3";
                arr.add(str);
                str = "";
            } else if(str.equals("four")){
                str = "4";
                arr.add(str);
                str = "";
            } else if(str.equals("five")){
                str = "5";
                arr.add(str);
                str = "";
            } else if(str.equals("six")){
                str = "6";
                arr.add(str);
                str = "";
            } else if(str.equals("seven")){
                str = "7";
                arr.add(str);
                str = "";
            } else if(str.equals("eight")){
                str = "8";
                arr.add(str);
                str = "";
            } else if(str.equals("nine")){
                str = "9";
                arr.add(str);
                str = "";
            }
        }
        
        long answer = 0;
        String s = "";
        for(int i = 0; i < arr.size(); i++) {
            s += arr.get(i);
        }
        
        answer = Long.valueOf(s);
        
        return answer;
    }
}