package college;
import java.util.Scanner;
public class multiArray 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and columns  of array");
		int rows=sc.nextInt();
		int column=sc.nextInt();
		int [][] array= new int [rows][column];
		System.out.println("enter the elements");
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
			     array[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
			     System.out.print(array[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}