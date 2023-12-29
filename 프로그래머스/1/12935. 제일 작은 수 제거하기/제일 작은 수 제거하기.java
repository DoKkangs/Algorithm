import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Arrays.stream(arr).min().getAsInt();
        for (int num : arr) {
            if(num != min){
                list.add(num);
            } else if (arr.length == 1) {
                list.add(-1);
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}