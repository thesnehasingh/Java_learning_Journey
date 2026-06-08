import java.util.Scanner;
public class RecursionFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements to be printed: ");
        int count = sc.nextInt();
        for(int i = 0; i<count; i++){
            System.out.println(" " +fibonacci(i));

        }
    }
    public static int fibonacci(int position){
        if(position == 0){
            return 0;
        }
        if(position == 1){
            return 1;
        }
        return fibonacci(position-1) + fibonacci(position - 2);

    }
}
