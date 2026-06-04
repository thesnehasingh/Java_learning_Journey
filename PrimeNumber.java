import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. you want to check whether its prime or not: ");
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("The no. is Prime");
        }
        else{
            System.out.println("The no. is not a Prime no.");
        }

        }

        public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        int i = 2;
        while(i<num) {
            if ((num % i) == 0) {
                return false;
            }
            i++;
        }
        return true;
        }
    }

