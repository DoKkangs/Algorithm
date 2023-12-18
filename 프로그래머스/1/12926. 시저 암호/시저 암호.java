class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] str = s.toCharArray();
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