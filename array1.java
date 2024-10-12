package college;

import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {
		int i;
	int []array= {10,11,77,66,12,34,55,88,99,100};
	System.out.println(array.length);
	for( i=0;i < array.length;i++)
	{
		
		System.out.println(array[i]*2);
	}
	for( i=0;i < array.length;i++)
	{
		Arrays.sort(array);
	}
	for( i=0;i < array.length;i++)
	{
		System.out.println(array[i]);
	}
	}

}
