import java.util.Scanner;
public class FactorialUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num = sc.nextInt();
        long fact = FactorialCalculate(num);
        System.out.println("Factorial of the given no. is " +fact);

    }
    public static long FactorialCalculate(int num){
        if(num<2){
            return 1;
        }
        long fact = 1;
        int i = 2;

        while(i<=num){
            fact = fact*i;
            i++;
        }
        return fact;

    }
}
