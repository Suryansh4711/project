import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int a = sc.nextInt();

        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        if (b != 0) {
            double result = (double) a / b;
            System.out.println("Quotient: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}