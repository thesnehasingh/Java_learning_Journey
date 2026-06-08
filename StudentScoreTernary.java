import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String Category = marks>80 ? "High" : (marks>50 ? "Moderate" : "Low");
        System.out.println("Your grade is is: " +Category);
    }
}
