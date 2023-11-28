import java.util.*;

class Solution {
    public int solution(int[] sides) {
       int answer = 0 ;
        int sum = 0 ;
        int max = 0;
        for(int item : sides){
            if(max < item) max = item;
            sum += item;
        }
        answer = (sum - max) > max ? 1 : 2;
        return answer;
    }
}