import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        if(n == 4 || n == 7) answer = -1;
        else if(n % 5 == 0) answer = n/5;
        else if(n % 5 == 1 || n % 5 == 3) answer = n/5 + 1;
        else if(n % 5 == 2 || n % 5 == 4) answer = n/5 + 2;
        System.out.println(answer);
    }
}