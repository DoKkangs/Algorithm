class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x;
        int h = 0;
        while (temp > 0){
            h+=temp%10;
            temp/=10;
        }
        System.out.println(h);
        answer = (x % h == 0) ? true : false ;
        return answer;
    }
}