import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The number of primes");
        int cnt = 0;
        int N = scanner.nextInt();
        int n = 2;
        int Sum = 0;
        while (cnt < N){
            boolean isPrime = true;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0 && i != 1) {
                isPrime = false;
                break;
                }
            }
            if (isPrime){
                Sum += n;
                ++cnt;
            }
            ++n;
        }
        System.out.println(Sum);
    }
}