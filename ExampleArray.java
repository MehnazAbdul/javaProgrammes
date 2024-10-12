package college;
import java.util.Scanner;
public class ExampleArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("The length of the array is "+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=sc.nextInt();
			 System.out.println(+arr[i]);
		}

	}

}
