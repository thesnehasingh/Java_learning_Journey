import java.util.Scanner;
public class DeleteFromArray {
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
        System.out.print("Enter the number you want to delete:");
        int n = sc.nextInt();
        int newarr[] = deleteNumber(arr, n);
        System.out.println("Here is your new array");
        DisplayArray(newarr);
    }

    public static int[] deleteNumber(int arr[], int n){
        int occ = NoOfOccurrences.Occurrence(arr, n);
        if(occ==0){
            return arr;
        }
        int newSize = arr.length - occ;
        int newarr[] = new int[newSize];

        int i = 0, j=0;

        while(i<arr.length){
            if(arr[i]!=n){
                newarr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newarr;

    }

    public static void DisplayArray(int arr[]){
        int i = 0;
        while(i<arr.length){
            System.out.println(" " +arr[i]);
            i++;
        }
        System.out.println();
    }
}
