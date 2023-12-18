import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Arrays.stream(arr).min().getAsInt();
        for (int i : arr) {
            if(i != min){
                list.add(i);
            } else if (arr.length == 1) {
                list.add(-1);
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}