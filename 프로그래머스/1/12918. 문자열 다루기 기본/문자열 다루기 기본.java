class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        answer = checkAnswer(s);
        return answer;
    }
    
    public static boolean checkAnswer(String s){
        boolean isCheck = false;
        if (s.length() == 4 || s.length() == 6) {
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] >= '0' && c[i] <= '9') {
                    isCheck = true;
                }else{
                    isCheck = false;
                    return false;
                }
            }
        }
        return isCheck;
    }
}
   