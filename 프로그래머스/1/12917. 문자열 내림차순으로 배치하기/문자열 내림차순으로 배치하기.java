import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        StringBuilder sb = new StringBuilder(new String(temp));
        answer = sb.reverse().toString();
        return answer;
    }
}