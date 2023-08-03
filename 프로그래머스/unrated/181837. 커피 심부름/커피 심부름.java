class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i = 0; i < order.length; i++){
            String o = order[i];
            if(o.equals("iceamericano")
               ||o.equals("americanoice")
               ||o.equals("hotamericano")
               ||o.equals("americanohot")
               ||o.equals("americano")
               ||o.equals("anything")) answer += 4500;
            else if(o.equals("icecafelatte")
                   ||o.equals("cafelatteice")
                   ||o.equals("hotcafelatte")
                   ||o.equals("cafelattehot")
                   ||o.equals("cafelatte")) answer += 5000;
        }
        return answer;
    }
}