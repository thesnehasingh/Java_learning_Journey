import java.util.Scanner;
public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print(" Enter the elements of an array: ");
        int i = 0;
        while (i < arr.length) {
            arr[i] = sc.nextInt();
            i++;
        }
        boolean isPalin = isPalindrome(arr);
        if(isPalin){
            System.out.println("Your array is a Palindrome. ");
        }
        else{
            System.out.println("Your array is not a Palindrome. ");
        }
    }

    public static boolean isPalindrome(int arr[]){
        int i = 0;
        while(i<arr.length/2){
            if(arr[i]!=arr[(arr.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
