import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println("Welcome to Integer Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter thr number you want to check: ");
        int number = sc.nextInt();

        if( number > 0 ) {
            System.out.println("The number you entered is Positive");
        }
        else if( number < 0 ) {
            System.out.println("The number you entered is Negative");
        }
        else {
            System.out.println("The number you entered is ZERO!!");
        }
    }
}
