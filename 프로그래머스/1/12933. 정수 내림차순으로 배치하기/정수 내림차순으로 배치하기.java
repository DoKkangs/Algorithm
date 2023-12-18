import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        int[] num = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            num[i] = s.charAt(i) - '0';
        }
        Integer[] num1 = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(num1, Collections.reverseOrder());
        int[] num2 = Arrays.stream(num1).mapToInt(Integer::intValue).toArray();
        String temp = "";
        for (int i : num2) {
            temp += i;
        }
        answer = Long.parseLong(temp);
        return answer;
    }
}