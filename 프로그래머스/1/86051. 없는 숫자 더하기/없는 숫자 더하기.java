class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int i : numbers) {
            if(((char)i + '0') >= '0' && ((char)i + '0') <= '9'){
                answer -= i;
            }
        }
        return answer;
    }
}