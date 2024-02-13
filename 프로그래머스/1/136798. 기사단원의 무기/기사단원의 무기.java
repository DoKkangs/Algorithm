import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        // 1.약수는 두 수의 곱이 자기 자신이 되는 것이기 때문에 제곱수를 제외하면 한 쌍으로 갖는다.
        // 2.약수 개수가 홀수개일 경우 약수의 개수는 가운데 수를 기준으로 같은 값을 같는다.
        // 3.약수 개수가 짝수개일 경우 약수의 개수는 서로 대응된다.
        
        // 주어진 number만큼 반복문을 돈다.
        for(int i = 1 ; i <= number ; i++){
            int cnt = 0;
            // number의 약수의 개수를 구한다.
            for(int j = 1 ; j*j <= i ; j++){
                if(j * j == i) cnt++; 
                else if(i % j == 0) cnt += 2; 
            }
            // 약수의 개수가 limit을 넘어가면 power
            if(cnt > limit) cnt = power;
            answer += cnt;
        }
        return answer;
    }
}