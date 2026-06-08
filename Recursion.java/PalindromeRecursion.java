import java.util.Scanner;
public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to be checked: ");
        String str = sc.next(); 
        System.out.println("Your string " +(isPalindrome(str) ? "is Palindrome." : "is Not Palindrome."));

    }
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPos = str.length() - 1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1, lastPos);// last pos cause this method skips last element
        return isPalindrome(newStr);
    }
}
