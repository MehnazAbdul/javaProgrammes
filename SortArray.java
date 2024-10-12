package college;
import java.util.Arrays;
import java.util.Scanner;
public class SortArray
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int [] array=new int[10];
		System.out.println("enter the 10 integers");
		for(int i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
			//System.out.println(+array[i]);
		}
		for (int i=0;i<10;i++)
		{
			System.out.println(+array[i]);
		}
		for (int i=0;i<10;i++)
		{
			Arrays.sort( array);
		}
        for(int i=0;i<10;i++)
        {
        	System.out.print(+array[i]+" ");
        }
	}

}
/*package college;

import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        
        System.out.println("Please enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

       /* // Sort the array
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

       /* sc.close();
    }
}
*/
