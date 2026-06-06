import java.util.Scanner;
public class Search2DArray {
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

        System.out.println("Now enter the number you want to search:");
        int num = sc.nextInt();

        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("Your element is present is this array");
        }
        else{
            System.out.println("Your element is not present in this array");
        }

    }

    public static boolean isFound(int[][] arr, int num){
        int i = 0;
        while(i<arr.length){
            int j = 0;
            while(j<arr[i].length){
                if(arr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
