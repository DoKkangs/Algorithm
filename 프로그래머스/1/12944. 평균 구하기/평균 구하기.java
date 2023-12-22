class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int total = 0;
        for(int num : arr){
            total += num;
        }
        answer = (double) total / arr.length;
        return answer;
    }
}