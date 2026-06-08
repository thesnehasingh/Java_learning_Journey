import java.util.Scanner;
public class LoopPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
        RightHalfPyramid(rows);
        ReverseRightHalfPyramid(rows);
        LeftHalfPyramid(rows);

    }

    public static void LeftHalfPyramid(int maxRows){
        int rows = maxRows;
        while (rows>0){
            int i = 0;
            while (i<rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void ReverseRightHalfPyramid(int maxRows){
        int rows = maxRows;
        while(rows>0){
            int i = 0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
    public static void RightHalfPyramid(int maxRows){
        int rows = 0;
        while(rows<maxRows){
            System.out.print("*");
            int i=0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
