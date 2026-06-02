import java.util.Scanner;
public class BitwiseAnd {
    public static void main(String[]args){
        System.out.println(" welcome to Bitwise AND calculator!! ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the first no.: ");
        int first = sc.nextInt();
        System.out.println("Enter the second no.: ");
        int second = sc.nextInt();

        int BitwiseAND = first & second;

        System.out.println(" The Bitwise And operation of the following no. is: " +BitwiseAND);
    }
}
