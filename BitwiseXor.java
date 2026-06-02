import java.util.Scanner;
public class BitwiseXor {
    public static void main(String[]args){
        System.out.println(" welcome to Bitwise XOR calculator!! ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the first no.: ");
        int first = sc.nextInt();
        System.out.println("Enter the second no.: ");
        int second = sc.nextInt();

        int Result = first ^ second;

        System.out.println(" The Bitwise XOR operation of the following no. is: " +Result);
    }
}

