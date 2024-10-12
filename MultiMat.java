package college;
import java.util.*;
public class MultiMat {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the rows and columns for matrixA");
        int row1 = sc.nextInt();
        int column1 = sc.nextInt();
        
        System.out.println("enter the rows and columns for matrixB");
        int row2 = sc.nextInt();
        int column2 = sc.nextInt();
        
        if (column1!=row2) {
            System.out.println("INVALID MATRIX!!!!");
        } else {
            System.out.println("Eligible Matrix");
             
        }
        
        int[][] matrixA = new int[row1][column1];
        int[][] matrixB = new int[row2][column2];
        
        System.out.println("ENTER THE ELEMENTS OF MATRIX A");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("matrixA:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        System.out.println("ENTER THE ELEMENTS OF MATRIX B");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("matrixB:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        int[][] matrixC = new int[row1][column2];
        
        // Initialize matrixC with zeros (explicitly shown, though it's done by default)
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                matrixC[i][j] = 0; // This line is technically not needed, but included for clarity
            }
        }
        
       
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                matrixC[i][j] = 0;
                for (int k = 0; k < column1; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        System.out.println("matrixC:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

