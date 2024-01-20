import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = "" + n; 
        for (char number : num.toCharArray()) {
            answer += Character.getNumericValue(number);;
        }
        return answer;
    }
}