import java.util.*;
class Solution {
    public String solution(String s) {
        // 문자열을 공백을 기준으로 분리함
        String[] temp = s.split(" ");
        // 최댓값 최솟값 변수
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // 분리한 문자열을 정수형으로 반환 후 최댓값과 최솟값을 구함
        for (int i=0; i<temp.length; i++){
            int num = Integer.parseInt(temp[i]);
            
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
            
        String answer = "";
        answer = min+" "+max;
        return answer;
    }
}