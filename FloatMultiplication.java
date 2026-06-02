import java.util.Scanner;
public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First floating no.:");
        Double a = sc.nextDouble();
        System.out.print("Enter second Floating no.:");
        Double b = sc.nextDouble();

        Double FloatMul = a * b;

        System.out.print("The value of float multiplication is:" +FloatMul);
    }
}
