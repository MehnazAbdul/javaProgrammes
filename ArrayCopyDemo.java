package college;
import java.util.*;
public class ArrayCopyDemo
{
     public static void main(String args[])
     {
    	 int[]arr= {0,2,3,5,7};
    	 int[]carr=new int[6];
    	 System.arraycopy(arr, 0, carr, 0, 5);
    	 System.out.println(Arrays.toString(carr));
     }
}
