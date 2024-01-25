class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // 1. n이 a개 보다 큰 동안 반복
        // 2. a개당 b병이므로 n/a후에 b만큼 곱한다.
        // 3. a가 2이고, b가 1인 경우와 같은 case들은 정확하게 나눠떨어지지 않음.
        // 그러므로 그 나머지값도 더해줘야함.
        while(n >= a){
            answer += n/a * b;
            n = n/a*b + n%a;
        }
        return answer;
    }
}