import java.util.Scanner;

public class Palindrome {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no. to be checked: ");
            int n = sc.nextInt();
            boolean isPalindrome = isPalindrome(n);
            if(isPalindrome){
                System.out.println("The no. is a Plaindrome ");
            }
            else{
                System.out.println("The no. is not a Plaindrome");
            }

        }

        public static boolean isPalindrome(int num) {
            int rev = Reverse(num);
            return num == rev;


        }
        public static int Reverse(int n){
            int rev = 0;
            while(n!=0){
                int digit = n%10;
                rev = rev*10+digit;
                n = n/10;
            }
            return rev;

        }
    }


