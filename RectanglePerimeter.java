import java.util.Scanner;
public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We are calculation Perimeter of a Rectangle");
        System.out.println("Enter side a:");
        int a = sc.nextInt();
        System.out.println("Enter side b:");
        int b = sc.nextInt();
        System.out.println("Enter side c:");
        int c = sc.nextInt();
        System.out.println("Enter side d:");
        int d = sc.nextInt();

        float Perimeter = a + b + c + d;

        System.out.println("The Perimeter of given rectangle is:" +Perimeter +"cm");
    }
}
