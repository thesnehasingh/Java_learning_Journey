import java.util.Scanner;
public class NoOfOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array.");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array elements: ");
        int i = 0;
        while(i<num){
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Enter the element you want to check the occurrences: ");
        int n = sc.nextInt();
        int occ = Occurrence(arr, num);
        System.out.println("The element " +n +" has occurred " +occ +" times");


    }
    public static int Occurrence(int arr[], int num){
        int occ = 0;
        int i = 0;
        while(i<arr.length){
            if(arr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
