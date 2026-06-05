import java.util.Scanner;
public class ArmstrongUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = sc.nextInt();
        boolean isArmStrong = isArmstrong(num);
        if(isArmStrong){
            System.out.println("The no. is an Armstrong number");
        }
        else{
            System.out.println("The no. is not an Armstrong number");
        }
    }
    public static boolean isArmstrong(int num){
        int digits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while(num>0){
            int lastdigit = num%10;
            num/=10;
            finalNumber = finalNumber + pow(lastdigit, digits);

        }
        return finalNumber == numCopy;

    }
    public static int pow(int num1, int num2){
        int result = 1;
        int i=0;
        while(i<num2){
            result = result*num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        if(num==0){
            return 1;
        }
                while(num!=0){
                    digits++;
                    num = num/10;
                }
                return digits;
    }
}
