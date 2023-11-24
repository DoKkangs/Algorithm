import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int N = sc.nextInt();
            sc.nextLine();
            if(N == 0) break;
            int cnt2 = 0;
            int cnt1 = 0;
            for(int i = 1 ; i <= 2*N ; i++){
                if(isPrime(i)){
                    cnt2++;
                }
                if(i == N){
                    cnt1 = cnt2;
                }
            }
            System.out.println(cnt2 - cnt1);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) { // Math.sqrt(n) 이유 ?
            if (n % i == 0) return false;
        }
        return true;
    }
}