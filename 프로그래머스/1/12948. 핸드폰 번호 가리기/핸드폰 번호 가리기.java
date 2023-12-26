class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] ps = phone_number.toCharArray();
        for (int i = 0; i < phone_number.length()-4; i++) {
            ps[i] = '*';
        }
        answer = String.valueOf(ps);
        return answer;
    }
}