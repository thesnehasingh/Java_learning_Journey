import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.: ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

        while(num!=0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        if (original == rev) {
            System.out.println("The number is Palindrome");
        }
        else{
            System.out.println("The number is not Palindrome");
        }
    }
}
