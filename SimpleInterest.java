import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Lets calculate the Simple interest");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amount, Rate and Time period: ");
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();

        double SimpleInterest = (P*R*T)/100;

        System.out.println("The value of Simple Interest is: " +SimpleInterest);
    }
}
