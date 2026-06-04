import java.util.Scanner;
public class SumOfDigitsUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();
        int Sum = DigitSum(num);
        System.out.println("Sum of digits of following no. is:" + Sum);


    }
    public static int DigitSum(int num){
        int sum = 0;
        while(num>0){
            sum = sum + (num%10);
            num = num/10;
        }
        return sum;
    }
}
