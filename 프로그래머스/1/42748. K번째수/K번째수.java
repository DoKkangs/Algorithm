import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 커맨드의 개수가 answer 배열의 크기
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            //반복문 둘면서 커맨드의 범위 만큼 임시 배열 뽑기(배열의 인덱스는 0부터 시작 주의)
            int[] temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            // 만들어진 배열 정렬
            Arrays.sort(temp);
            // 정렬된 배열 요소 몇번째인지 추가(배열은 인덱스가 0부터 시작하므로 커맨드에서 1을 빼준다) 
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}