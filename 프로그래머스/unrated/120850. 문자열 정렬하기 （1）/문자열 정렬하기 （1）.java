import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        ArrayList<Integer> an = new ArrayList<Integer>();
        for(char c : my_string.toCharArray()){
            an.add(c - '0');
        }
        int[] answer = an.stream().mapToInt(i-> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}