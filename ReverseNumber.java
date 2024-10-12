package college;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,reverse =0;
		System.out.println("enter the number to be reversed");
		n=sc.nextInt();
		for(i=0;n!=0;i++)
		{
			int remainder=n%10;
			reverse=reverse*10 +remainder;
			n/=10;
		}
		System.out.println("the reversed number is "+reverse);
	}

}
