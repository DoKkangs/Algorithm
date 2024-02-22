class Solution {
    public int solution(String s) {
        int answer = 1;
        // 첫 문자 나온 횟수
        int first=1; 
        // 뒤의 문자들이 나온 횟수
        int diff=0;
        // charAt돌릴 시작지점
        int left = 0; 
        // 비교할 char
        int right = 1;

        while(right < s.length()) {            
            if(first == diff) {
                left = right;
                right += 1;
                first=1; diff=0;
                answer++;
            }
            else {
                if(s.charAt(left) == s.charAt(right)) {
                    first++;
                }
                else {
                    diff++;
                }
                right++;
            }
        }
        return answer;
    }
}