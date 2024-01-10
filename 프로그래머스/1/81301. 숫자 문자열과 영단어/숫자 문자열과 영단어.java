class Solution {
    public int solution(String s) {
        int answer = 0;
        // 0부터 9까지 숫자 매칭 배열
        String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
        // 0부터 9까지 단어 매칭 배열
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        // for문으로 입력받은 문자열을 돌면서 단어가 발견되면 숫자 매칭 배열과 인덱스로 매칭해서 변환
        for (int i = 0; i < 10; i++) {
            s = s.replace(words[i],nums[i]);
        }
        // 문자열을 숫자로 변환
        answer = Integer.parseInt(s);
        return answer;
    }
}