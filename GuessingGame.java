import java.util.Scanner;
public class GuessingGame {

    int random;

    GuessingGame(){
        random = (int) Math.ceil(Math.random() * 100);
    }

    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Guess a number between 0 to 100");
        int guess;
        int result;
        do{
            System.out.println("Guess the number");
            guess = sc.nextInt();
            result = game.guess(guess);
            if(result == 0){
                System.out.println("Yayy you have guessed the correct number");
            }
            else if (result<0){
                System.out.println("Your number is higher than you guessed");
            }
            else{
                System.out.println("Your number is lower than you guessed");
            }
        }while(result!=0);
    }
}
