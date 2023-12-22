class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for(int item : numbers){
            sum += item;
        }
        answer = sum / numbers.length;
        return answer;
    }
}