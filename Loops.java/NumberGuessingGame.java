import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to number guessing game ");
        int num = 5;
        int guess = 5;
        do{
            System.out.print(" Please Guess a number between 0 to 10: ");
            guess = sc.nextInt();
        }
        while(num!=guess);
        System.out.println(" You have successfully guessed the number!!");
    }
}
