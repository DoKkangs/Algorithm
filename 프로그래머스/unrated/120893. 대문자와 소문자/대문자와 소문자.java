class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] word = my_string.toCharArray();
        for(char c : word){
            if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }else{
                answer += Character.toLowerCase(c);
            }
        }
        return answer;
    }
}