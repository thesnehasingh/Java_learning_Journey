import java.util.Scanner;
public class gcdOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no. ");
        int first = sc.nextInt();
        System.out.println("Enter the second no. ");
        int second = sc.nextInt();
        int gcd = gcd(first, second);
        System.out.println("GCD of these no. is " +gcd);
    }
    public static int gcd(int first, int second){
        int gcd = 1;
        int i = 2; // since 1 will be the factor of all so loop starts with 2
        int least = least(first,second);
        while(i<=least){
            if(first%i==0 && second%i==0){
                gcd = i;
            }
            i++;

        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if(num1<num2){
            return num1;
        }
        else{
            return num2;
        }

    }
}
