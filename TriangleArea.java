import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets calculate Area of a Triangle");
        System.out.println("Enter the base of your Triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter the height of your Triangle: ");
        double h = sc.nextDouble();

        double TriangleArea = (b * h)  * 1/2;

        System.out.print("Area of your Triangle is: " +TriangleArea);
    }
}
