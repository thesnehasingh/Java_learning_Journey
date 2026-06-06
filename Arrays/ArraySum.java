import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array elements");
        int i=0;
        while(i<num){
            arr[i] = sc.nextInt();
            i++;
        }
        int sum = Sum(arr);
        System.out.println("Sum of array elements: " +sum);


    }
    public static int Sum(int arr[]){
        int sum = 0;
        int i=0;
        while(i<arr.length){
            sum = sum + arr[i];
            i++;
        }
        return sum;
    }
}
