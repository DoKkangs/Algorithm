class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = GCD(n,m);
        int lcm = LCM(n,m,gcd);
        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }

    public static int GCD(int a,int b){
        int result = 0;
        while(a % b != 0){
            result = a % b;
            a = b;
            b = result;
        }
        return b;
    }
    
    public static int LCM(int n,int m, int gcd){
        return (n * m) / gcd;
    }
}