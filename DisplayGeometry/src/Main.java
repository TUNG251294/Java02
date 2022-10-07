import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rectangleWidth, rectangleHeight, triangleSide;
        System.out.println("Input Rectangle Width");
        rectangleWidth = scanner.nextInt();
        System.out.println("Input Rectangle Height");
        rectangleHeight = scanner.nextInt();
        System.out.println("Input Triangle Side");
        triangleSide = scanner.nextInt();
        //Hình chữ nhật
        for (int i = 1; i <= rectangleHeight; i++) {
            String row = "";
            for (int j = 1; j <= rectangleWidth; j++) {
                row += "* ";
            }
            System.out.println(row);
        }
        //Hình tam giác
        String row = "*";
        for (int i = 1; i <= triangleSide; i++) {
            System.out.println(row);
            row += " *";
        }
        //Hình tam giác ngược
        for (int j = triangleSide; j >= 1; j--) {
            String row2 = "";
            for (int i = 1; i <= j; i++) {
                row2 += "# ";
            }
            System.out.println(row2);
        }
        //Hình tam giác cân
        for (int i = 1; i <= triangleSide; i++){
            String row3 = "";
            for(int j = 1; j<= triangleSide -i; j++){
                row3 += " ";
            }
            for(int k = 1; k <= i; k++){
                row3 += "* ";}
            System.out.println(row3);
        }
    }
}