import java.util.Scanner;
public class Arithematic {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to arithematic calculator");
        System.out.println("Enter first no.:");
        int a = sc.nextInt();
        System.out.println("Enter the second no.:");
        int b = sc.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("The value of addition is:" +add);
        System.out.println("The value of subtraction is:" +sub);
        System.out.println("The value of multiplication is:" +mul);
        System.out.println("The value of division is:" +div);
        System.out.println("The value of modulus is:" +mod);
    }
}
