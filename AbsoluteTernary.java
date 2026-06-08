import java.util.Scanner;
public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        int absolute = num>=0 ? num : -num;
        System.out.println("Absolute value of your number is: " +absolute);
    }
}
