import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money");
        double money = scanner.nextDouble();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter Interest Rate");
        double interestRate = scanner.nextDouble();
        double totalInterest;
        totalInterest = money*month*(interestRate/100)/12;
        System.out.printf("%s%,.2f","Total of interest: ", totalInterest);
    }
}