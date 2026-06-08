import java.util.Scanner;
public class SumPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        for(int num : arr){
            if(num<0){
                continue;
            }
            sum = sum + num;
        }
        System.out.println("The sum of positive numbers is: "+sum);


    }
}
