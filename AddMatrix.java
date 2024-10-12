package college;
import java.util.*;
public class AddMatrix 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the  rows and columns of matrix A");
	   int row1,col1;
	   row1=sc.nextInt();
	   col1=sc.nextInt();
	   System.out.println("enter rows and columns for matrix B");
	   int row2,col2;
	   row2=sc.nextInt();
	   col2=sc.nextInt();
	   int [][] matrixA=new int[row1][col1];
	   int [][] matrixB=new int[row2][col2];
	   int [][] matrixC=new int[row1][col1];
	   int i,j;
	   if ((row1==row2 && (col1==col2)))
	   {
		   System.out.println("VALID MATRIX");
	   }
	   else
	   {
		   System.out.println("INVALID MATRIX");
	   }
	   System.out.println("enter the elements of matrix A");
	   for(i=0;i<row1;i++)
	   {
		   for(j=0;j<col2;j++)
		   {
			   matrixA[i][j]=sc.nextInt();
		   }
	   }
	   System.out.println("MATRIX A");
	   for(i=0;i<row1;i++)
	   {
		   for(j=0;j<col2;j++)
		   {
			   System.out.print(+matrixA[i][j]+" "); 
		   }
		   System.out.print("\n");
	   }
	   System.out.println("Enter elements of matrix B ");
	   for(i=0;i<row1;i++)
	   {
		   for(j=0;j<col2;j++)
		   {
			   matrixB[i][j]=sc.nextInt();
		   }
	   }
	   System.out.println("MATRIX B");
	   for(i=0;i<row1;i++)
	   {
		   for(j=0;j<col2;j++)
		   {
			   System.out.print(+matrixB[i][j]+" ");
		   }
		   System.out.print("\n");
	   }
	   System.out.println("MATRIX C");
	   for(i=0;i<row1;i++)
	   {
		   for(j=0;j<col2;j++)
		   {
			   matrixC[i][j]=matrixA[i][j]+matrixB[i][j];
		   }
	   }
	   for(i=0;i<row1;i++)
	   {
		   for(j=0;j<col2;j++)
		   {
			   System.out.print(matrixC[i][j]+" ");
		   }
		   System.out.print("\n");
	   }
   }
}
