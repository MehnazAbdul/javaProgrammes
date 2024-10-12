package college;
import java.util.Scanner;
public class SwitchDemo 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        switch (num)
        {
        case 10:
        	System.out.println(" number is ten");
        	break;
        case 20:
        	System.out.println("number is 20");
        	break;
        case 30:
        	System.out.println("number is 30");
        	break;
        default:
        	System.out.println("number is not 10,20 or 30");
        	break;
        	
        }
	}

}
