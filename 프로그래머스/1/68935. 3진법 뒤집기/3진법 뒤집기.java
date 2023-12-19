class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        int length = sb.length();
        for (int i = 0; i < length; i++) {
            answer += (sb.charAt(i)-'0')*(int)(Math.pow(3,length-1-i));
        }
        return answer;
    }
}