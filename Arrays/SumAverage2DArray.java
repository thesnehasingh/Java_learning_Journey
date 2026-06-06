import java.util.Scanner;
public class SumAverage2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the size of coloumns: ");
        int n2 = sc.nextInt();
        int arr[][] = new int[n1][n2];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                System.out.print(" " +arr[i][j]);
            }
            System.out.println();
        }
        long sum = sum(arr);
        double average = average(arr);
        System.out.println("Sum of array is: " +sum);
        System.out.println("Average of array is: " +average);

    }

    public static long sum(int arr[][]){
        int i = 0;
        int sum = 0;
        while(i<arr.length){
            int j = 0;
            while(j<arr[i].length){
                sum = sum + arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double average(int arr[][]){
        if(arr.length==0){
            return 0;
        }
        int rows = arr.length;
        int cols = arr[0].length;
        double size = rows*cols;
        return sum(arr)/size;
    }
}
