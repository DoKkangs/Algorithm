import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> an = new ArrayList<Integer>();
        for(char c : my_string.toCharArray()){
            if(c >= '0' && c <='9') an.add(c - '0');
        }
        int[] answer = an.stream().mapToInt(i-> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}