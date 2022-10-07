import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
        byte number = scanner.nextByte();
        switch (number){
            case 1:
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                break;
            case 2:
                System.out.println("* * *");
                System.out.println("* * *");
                System.out.println("* * *");
                break;
            case 3:
                System.out.println("* * * *");
                System.out.println("* * * *");
                System.out.println("* * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice");
        }
    }
}