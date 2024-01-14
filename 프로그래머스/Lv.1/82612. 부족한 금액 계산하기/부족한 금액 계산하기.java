class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total  = 0;
        for(int i = 0 ; i <= count ; i++){
            total += price * i;
        }
        answer = 0;
        if(!(money >= total)) answer = total - money;
        
        
        
        return answer;
    }
}