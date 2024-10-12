package college;
import java.util.Scanner;
public class factwhile 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number ");
	  int n,i=1,factorial=1;
	  n=sc.nextInt();
	  while(i<=n)
	  {
		  factorial*=i;
		  i++;
	  }
	  System.out.println("the factorial of "+n +""+"is "+factorial);
  }
}
