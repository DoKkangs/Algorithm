import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> list = new TreeSet();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = Arrays.stream(list.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}