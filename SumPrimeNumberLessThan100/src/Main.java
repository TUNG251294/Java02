import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number which Prime number is less than");
        int N = scanner.nextInt();
        int n = 2;
        int Sum = 0;
        while (n < N) {
            if (isPrime(n)) {
                Sum += n;
            }
            ++n;
        }
        System.out.println(Sum);
    }

    public static boolean isPrime(int n){
        boolean checkPrime = true;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n%i == 0 && i != 1){
                checkPrime = false;
                break;
            }
        }
        return checkPrime;
    }
}