import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int i = 0;
        for(int item : numbers){
            answer[i++] = item * 2;
        }
        return answer;
    }
}