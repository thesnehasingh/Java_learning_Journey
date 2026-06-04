import java.util.Scanner;
public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ODD sum calculator!!");
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = OddSum(num);
        System.out.println("Odd sum till " + num +" is " +sum);
    }

    public static int OddSum( int num){
        int i = 1;
        int sum = 0;
        while(i<=num){
            sum+=i;
            i+=2;
        }
        return sum;
    }
}
