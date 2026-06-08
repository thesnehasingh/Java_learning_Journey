import java.util.Scanner;
public class ExitOnExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter your command: ");
            String command = sc.next();
            if(command.equalsIgnoreCase("exit")){ // we did not use == cause it cannot compare reference of objects.
                break; // and we used equalsIgnoreCase to ignore capital and small exit, now it will exit even on EXIT.
            }
        }
        System.out.println("You have successfully exited!!");
    }
}
