class Solution {
    public long solution(long n) {
        long num1 = (long)Math.sqrt(n);
        double num2 = Math.sqrt(n);
        long answer = num1==num2 ? (long)Math.pow(num1+1,2) : -1;
        return answer;
    }
}