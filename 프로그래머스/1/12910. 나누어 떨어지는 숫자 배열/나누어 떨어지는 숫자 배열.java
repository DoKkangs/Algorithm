import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            if( num % divisor == 0){
                list.add(num);
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        
    
        return answer;
    }
}