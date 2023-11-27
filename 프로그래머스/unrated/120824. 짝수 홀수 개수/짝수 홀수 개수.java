class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int item : num_list){
            answer[item % 2]++;
        }
        return answer;
    }
}