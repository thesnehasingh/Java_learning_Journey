import java.util.Scanner;
class MonthSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your month number: ");
        int num = sc.nextInt();
        String monthName = monthName(num);
        System.out.println("Your month name is: " +monthName);

    }

    public static String monthName(int num){
        String monthName = switch(num){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
        return monthName;
    }
}
