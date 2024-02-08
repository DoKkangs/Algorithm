class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 3개의 수를 더할 변수
        int sum =0;
        // 반복문을 돌며 서로 다른 수 3개 더하기
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                for(int k = j + 1 ; k < nums.length ; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    
                    //소수 찾기(소수일때 정답 카운트 1 증가)
                    if(isPrime(sum)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
        
    private boolean isPrime(int num){
		// 자기 자신 외에 나누어지는 수가 있다면 소수가 아님
        for(int i = 2 ; i < num ; i++){
            if(num % i==0)
                return false;
        }
		//나누어 떨어지지 않으면 true
        return true;
    }  
}