/*package college;
import java.util.Scanner;

public class SwitchMonthDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the month
        System.out.println("Enter the month: ");
        String monthName = sc.nextLine();

        // Input for the year
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        int numberOfDays = 0;

        switch (monthName.toLowerCase()) {
            case "january": case "march": case "may": case "july":
            case "august": case "october": case "december":
                numberOfDays = 31;
                break;
            case "april": case "june": case "september": case "november":
                numberOfDays = 30;
                break;
            case "february":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
                {
                    numberOfDays = 29;
                } else
                {
                    numberOfDays = 28;
                }
                break; // Add break to exit the switch case
            default:
                System.out.println("Invalid Month");
                 // Exit the program as month is invalid
        }

        // Output the number of days
        System.out.println("The number of days in " + monthName + " " + year + " is " + numberOfDays);
        sc.close();
    }
}*/
package college;
import java.util.Scanner;
public class SwitchMonthDays 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month");
		String monthName;
		monthName=sc.nextLine();
		int year=0;
		System.out.println("Enter the year");
		year=sc.nextInt();
		int numberOfDays=0;
		switch(monthName.toLowerCase())
		{
		   case "january":case "march":case "may":case "july":
		   case "august":case "october":case "december":
			   numberOfDays=31;
			   break;
		   case "april":case "june":case "september":case "november":
               numberOfDays=30;
               break;
		   case "February":
			   //if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			   if((year % 4==0 &&year % 100!=0)||(year % 400==0))
			   {
				   numberOfDays=29;
			   }
			   else
			   {
				   numberOfDays=28;
			   }
	       default:
	    	   System.out.println("Invalid Month");
		        break;
		 }
		System.out.println("The number of days in "+ monthName+""+ year+"is "+numberOfDays);

	}

}

