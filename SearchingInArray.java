import java.util.Scanner;
public class SearchingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Lets see if an element is present inside our array or not!");
        int []myArr = {3,6,8,87,65,4,68,23,9,98,34,};
        System.out.println("Enter the no. you want to search: ");
        int num = sc.nextInt();
        boolean isFound = isFound(myArr, num);
        if(isFound){
            System.out.println("The no. you are searching for is present in the array");
        }
        else{
            System.out.println("The no. you are searching for is not present in the array");
        }

    }
    public static boolean isFound(int[]myArr, int num){
        int index = 0;
        while(index<myArr.length){
            if(myArr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
