class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        if(c.length % 2 == 0){
            answer = "" + c[c.length/2-1] + c[c.length/2];
        }else answer = "" + c[c.length/2];
        return answer;
    }
}