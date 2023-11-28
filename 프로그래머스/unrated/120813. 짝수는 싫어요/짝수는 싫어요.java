import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 1; i <= n ; i+=2){
            temp.add(i);
        }
        answer = temp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}