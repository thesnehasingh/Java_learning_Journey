import java.util.Scanner;
public class ArrayTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets learn Array Traversal!! ");
        int myArr[] = { 6, 9, 21, 57, 89, 98};

        int index = 0;
        while(index<myArr.length){
            System.out.println(myArr[index]);
            index++;
        }
    }
}
