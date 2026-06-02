import java.util.Scanner;
public class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no. you want to check: ");
        int num = sc.nextInt();
        if( (num & 1) == 0 ){
            System.out.println(" The no. is EVEN ");
        }
        else{
            System.out.println(" The no. is ODD ");
        }
    }
}
