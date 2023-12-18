import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] s = String.valueOf(n).split("");
        Arrays.sort(s);
        
        StringBuilder sb = new StringBuilder();
        for(String str : s){
            sb.append(str);
        }
        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}