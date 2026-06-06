import java.util.Scanner;
public class IsSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements of the array: ");
        int i = 0;
        while(i<arr.length){
            arr[i] = sc.nextInt();
            i++;

        }
        boolean isIncreasing = isIncreasing(arr);
        boolean isDecreasing = isDecreasing(arr);
        if( isIncreasing || isDecreasing){
            System.out.println(" Your array is Sorted!! ");
        }
        else{
            System.out.println("Your array is not sorted!! ");
        }


    }
    public static boolean isIncreasing(int arr[]){
        int i = 0;
        while(i<arr.length-1){
            if(arr[i]>arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int arr[]){
        int i = 0;
        while(i<arr.length-1){
            if(arr[i]<arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
