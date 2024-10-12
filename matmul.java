package college;

import java.util.*;

public class matmul
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns for matrix A");
        int row1 = sc.nextInt();
        int column1 = sc.nextInt();
        System.out.println("Enter the rows and columns for matrix B");
        int row2 = sc.nextInt();
        int column2 = sc.nextInt();

        if (column1 != row2) 
        {
            System.out.println("Invalid Matrix!!!!");
            
        } 
        else 
        {
            System.out.println("ELIGIBLE MATRIX");
            int[][] matrixA = new int[row1][column1];
            int[][] matrixB = new int[row2][column2];
            System.out.println("ENTER THE ELEMENTS OF MATRIX A");
            for (int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < column1; j++)
                {
                     matrixA[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matrix A:");
            for (int i = 0; i < row1; i++)
            {
                for (int j = 0; j < column1; j++) 
                {
                      System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("ENTER THE ELEMENTS OF MATRIX B");
            for (int i = 0; i < row2; i++)
            {
                for (int j = 0; j < column2; j++) 
                {
                     matrixB[i][j] = sc.nextInt();
                }
            }

            System.out.println("Matrix B:");
            for (int i = 0; i < row2; i++) 
            {
                for (int j = 0; j < column2; j++)
                {
                     System.out.print(matrixB[i][j] + " ");
                }
                System.out.println();
            }

      
            int[][] matrixC = new int[row1][column2]; 
       
            for (int i = 0; i < row1; i++) 
            {
                 for (int j = 0; j < column2; j++) 
                 {
                      matrixC[i][j] = 0;
                      for (int k = 0; k < column1; k++)
                      {
                            matrixC[i][j] += matrixA[i][k] * matrixB[k][j]; 
                      }
                  }
            }

            System.out.println("Matrix C:");
            for (int i = 0; i < row1; i++) 
            {
                 for (int j = 0; j < column2; j++) 
                 {
                       System.out.print(matrixC[i][j] + " ");
                 } 
                 System.out.println();
            }
        }
    }
}



