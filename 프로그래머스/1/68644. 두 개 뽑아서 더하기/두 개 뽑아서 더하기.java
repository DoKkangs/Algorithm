import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 결과의 중복값이 없고, 정렬을 위해 set사용
        TreeSet<Integer> list = new TreeSet();
        // 반복문을 돌며 서로 다른 두 수를 더한다.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        // set을 int 배열로 변환
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}