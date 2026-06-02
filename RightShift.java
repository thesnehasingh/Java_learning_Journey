import java.util.Scanner;
public class RightShift {
    public static void main(String[] args) {
        System.out.println(" Welcome to Bitwise Right Shift Calculator ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no.: ");
        int a = sc.nextInt();

        int Result = a >> 1;

        System.out.println(" The Bitwise Right Shift operation of the following no. is: " +Result );

    }
}
