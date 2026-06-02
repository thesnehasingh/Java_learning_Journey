import java.util.Scanner;
public class BitwiseNot {
    public static void main(String[] args) {
        System.out.println(" Welcome to Bitwise NOT Calculator ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no.: ");
        int a = sc.nextInt();

        int Result = ~a;

        System.out.println(" The Bitwise NOT operation of the following no. is: " +Result );

    }
}
