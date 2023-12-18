class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int h = 0;
        String[] list = String.valueOf(x).split("");
        for (String str : list) {
            h += Integer.parseInt(str);
        }
        answer = (x % h == 0) ? true : false ;
        return answer;
    }
}