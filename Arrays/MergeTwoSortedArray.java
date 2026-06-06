import java.util.Scanner;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.print(" Enter the elements of an array: ");
        int i = 0;
        while (i < arr1.length) {
            arr1[i] = sc.nextInt();
            i++;
        }
        System.out.print("Enter the size of other array:");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.print(" Enter the elements of other array: ");
        i = 0;
        while (i < arr2.length) {
            arr2[i] = sc.nextInt();
            i++;
        }
        int MergedArray[] = Merge(arr1, arr2);
        System.out.println("Your merged array: ");
        DisplayArray(MergedArray);

    }

    public static int[] Merge(int arr1[], int arr2[]){
        int newSize = arr1.length + arr2.length;
        int newArr[] = new int[newSize];

        int i=0, j=0, k=0;
        while(i<arr1.length || j<arr2.length){
            if(j==arr2.length || (i<arr1.length&&arr1[i]<arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;

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
