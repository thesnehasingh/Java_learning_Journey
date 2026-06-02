import java.util.Scanner;
public class ConvertFtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets convert Fahrenheit into Celsius!!");
        System.out.println("Enter degree Fahrenheit: ");
        double F = sc.nextDouble();

        double C = (F - 32) * 5 / 9;

        System.out.println("Degre celsius is: " +C);
    }
}
