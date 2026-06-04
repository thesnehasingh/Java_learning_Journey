import java.util.Scanner;
public class LcmOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no. ");
        int first = sc.nextInt();
        System.out.println("Enter second no. ");
        int second = sc.nextInt();
        int fact = Lcm(first, second);
        System.out.println("LCM of " + first +" and "  + second +" is " +fact);
    }
    public static int Lcm(int first, int second){
        int i = 1;
        while(true){
            int fact = first * i;
            if(fact%second==0){
                return fact;
            }
            i++;
        }
    }
}
