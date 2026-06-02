import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Lets calculate the Compound Interest");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle amount, Rate and Time period: ");
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();

        double CompoundInterest = P * Math.pow((1 + R / 100), T);

        System.out.println("The value of Compound Interest is: " +CompoundInterest);
    }
}
