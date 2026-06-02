import java.util.Scanner;
public class CheckOddEven {
    public static void main(String[]args){
        System.out.println("Welcome to Odd or Even Checker");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int number = sc.nextInt();

        if( number % 2 == 0) {
            System.out.println("The number you entered is an Even number");
        }
        else {
            System.out.println("The number you entered is an Odd number");
        }
    }
}
