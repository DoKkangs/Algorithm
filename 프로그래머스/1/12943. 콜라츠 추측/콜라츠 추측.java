class Solution {
    public int solution(int num) {
        int answer = 0;
        long k = num;
        if(k == 1) answer = 0;
        while (k != 1){
            if(answer == 500){
                answer = -1;
                break;
            }
            if(k % 2 == 0){
                k/=2;
                answer++;
            }else {
                k = k*3+1;
                answer++;
            }
        }
        return answer;
    }
}