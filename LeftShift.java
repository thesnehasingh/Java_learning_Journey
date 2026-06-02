import java.util.Scanner;
public class LeftShift {
    public static void main(String[] args) {
        System.out.println(" Welcome to Bitwise Left Shift Calculator ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no.: ");
        int a = sc.nextInt();

        int Result = a << 1;

        System.out.println(" The Bitwise Left Shift operation of the following no. is: " +Result );

    }
}
