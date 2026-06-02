import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        System.out.println("Welcome to the Grade Calculator!!");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your percentage: ");
        double percentage = sc.nextDouble();

        if( percentage >= 90 ){
            System.out.println("Your Grade is A, woohoo!!");
        }
        else if ( percentage >= 75 ){
            System.out.println("Your Grade is B, not bad!!");
        }
        else if ( percentage >= 60 ){
            System.out.println("Your Grade is C, ok ok!");
        }
        else if ( percentage >= 30 ){
            System.out.println("Your Grade is D, work hard!!");
        }
        else {
            System.out.println("YOU ARE FAILED!!!! Foucus on studies.");
        }
    }
}
