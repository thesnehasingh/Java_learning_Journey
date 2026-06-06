import java.util.Scanner;
public class MaxMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Enter the elements of the array: ");
        int i = 0;
        while(i<arr.length){
            arr[i] = sc.nextInt();
            i++;
        }

        int max = Max(arr);
        int min = Min(arr);
        System.out.println("The max. element of this array is: " +max);
        System.out.println("The min. element of this array is: " +min);

    }
    public static int Min(int arr[]){
        int i = 0;
        int min = arr[0];
        while(i<arr.length){
            if(arr[i]<min) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }
    public static int Max(int arr[]){
        int i = 0;
        int max = arr[0];
        while(i<arr.length){
            if(arr[i]>max){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
}
