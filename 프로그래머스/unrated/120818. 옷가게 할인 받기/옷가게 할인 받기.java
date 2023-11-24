class Solution {
    public int solution(int price) {
        int answer = 0;
        int sale = price / 100000;
        if(sale >= 5){
            answer = (int)(price * 0.8);
        }else if(sale >= 3){
            answer = (int)(price * 0.9);
        }else if(sale >= 1){
            answer = (int)(price * 0.95);
        }else{
            answer = price;
        }
        return answer;
    }
}