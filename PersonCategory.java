import java.util.Scanner;
public class PersonCategory {
    public static void main(String[] args) {
        System.out.println(" lets categorise people on basis of their Age!! ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the age of the person: ");
        int age = sc.nextInt();

        if( age < 13 ){
            System.out.println(" You are a child ");
        }
        else if ( age < 20 ){
            System.out.println(" You are a teenager ");
        }
        else if ( age < 60 ){
            System.out.println(" You are an Adult ");
        }
        else{
            System.out.println("You are a Senior Citizen");
        }
    }
}
