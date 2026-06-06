import java.util.Scanner;
public class SumOfDiagonalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the size of coloumns: ");
        int n2 = sc.nextInt();
        int arr[][] = new int[n1][n2];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        long DiagonalSum = sumOfDiagonal(arr);
        System.out.println("Sum of Diagonal elements is: " +DiagonalSum);

    }
    public static long sumOfDiagonal(int arr[][]){
        long LeftSum = sumOfLeftDiagonal(arr);
        long RightSum = sumOfRightDiagonal(arr);
        long sum = LeftSum + RightSum;
        if(arr.length%2!=0){
            int mid = arr.length/2;
            sum -= arr[mid][mid];
        }
        return sum;

    }

    public static long sumOfLeftDiagonal(int arr[][]){
        long sum = 0;
        int i = 0;
        while(i<arr.length){
            sum = sum + arr[i][i];
            i++;
        }
        return sum;

    }

    public static long sumOfRightDiagonal(int arr[][]){
        int i = 0;
        int sum = 0;
        while(i<arr.length){
            int cols = arr.length-1-i;
            sum = sum + arr[i][cols];
            i++;
        }
        return sum;

    }
}
