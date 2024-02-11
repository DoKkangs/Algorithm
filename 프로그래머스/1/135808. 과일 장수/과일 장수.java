import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // 먼저 점수를 정렬
        Arrays.sort(score);
        // 전체 점수의 길이에서 한 상자의 들어가는 수만큼 빼고 m만큼 감소하면서 진행
        for(int i = score.length - m; i >= 0; i -= m){
            // 최소 점수에 한 상자에 담긴 개수를 곱해서 답을 구함
            answer += score[i] * m;
        }
        return answer;
    }
}