import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num = sc.nextInt();

        int original = num;
        int count = 0;
        int temp = num;

        while(temp!=0){
            temp = temp/10;
            count++;
        }
        int sum = 0;

        while(num!=0){
            int digit = num%10;
            sum += Math.pow(digit, count);
            num = num/10;
        }
        if(sum == original) {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
