class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int i : numbers) {
            if(Character.forDigit(i,10)>='0' && Character.forDigit(i,10) <= '9'){
                answer -= i;
            }
        }
        return answer;
    }
}