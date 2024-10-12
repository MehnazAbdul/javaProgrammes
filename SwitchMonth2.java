package college;
import java.util.Scanner;

public class SwitchMonth2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month (1-12): ");
        int month = sc.nextInt();	
        String monthName = ""; // Initialize monthName

        switch(month) {
            case 1:
                monthName = "JANUARY";
                break;
            case 2:
                monthName = "FEBRUARY";
                break;
            case 3:
                monthName = "MARCH";
                break; // Add break here
            case 4:
                monthName = "APRIL";
                break;
            case 5:
                monthName = "MAY";
                break;
            case 6:
                monthName = "JUNE";
                break;
            case 7:
                monthName = "JULY";
                break;
            case 8:
                monthName = "AUGUST";
                break;
            case 9:
                monthName = "SEPTEMBER";
                break;
            case 10:
                monthName = "OCTOBER";
                break;
            case 11:
                monthName = "NOVEMBER";
                break;
            case 12:
                monthName = "DECEMBER";
                break;
            default:
                System.out.println("INVALID NUMBER");
                break;
        }
        
        // Print month name only if it's valid
        if (!monthName.isEmpty()) {
            System.out.println(monthName);
        }
        
        sc.close();
    }
}
