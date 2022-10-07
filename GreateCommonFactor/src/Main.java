import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scanner.nextInt();
        System.out.println("Enter number b");
        int b = scanner.nextInt();
        int gcf = 1;
        int maxAbs = Math.max(Math.abs(a),Math.abs(b));
        String result;
        if (a == 0 && b == 0) {
            result = "No greatest common factor";
        } else if (a == 0 || b == 0){
            gcf = maxAbs;
            result = "Greatest common factor is " +gcf;
        } else {
            for (int i = 2; i <= maxAbs; i++){
                if(a%i == 0 && b%i == 0){
                    gcf = i;
                }
            }
            result = "Greatest common factor is " +gcf;
        }
        System.out.println(result);
    }
}