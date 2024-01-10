class Solution {
    public String solution(String s, int n) {
        String answer = "";
        // 받아온 배열을 단어 단위로 관리하기 위해 character 배열로 변환
        char[] str = s.toCharArray();
        // 스페이스가 들어있으면 스페이스를 추가해주고 알파벳이 들어오면 n만큼 이동후
        // 알파벳의 끝인 z를 넘어가면 모듈러 연산으로 a부터 시작하도록 해서 대소문자 변환
        for(char c : str){
            if(c == ' '){
                answer += ' ';
            }else{
                if(Character.isLowerCase(c)) {
                    answer += (char)('a' + ((c - 'a' + n) % 26));
                }else if (Character.isUpperCase(c)) {
                    answer += (char)('A' + ((c - 'A' + n) % 26));
                }
            }
        }
        return answer;
    }
}