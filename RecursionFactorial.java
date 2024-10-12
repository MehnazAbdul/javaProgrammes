package college;
import java.util.Scanner;
class Factorial
{
   int fact(int n)
   {
       int result;
       if(n==1)
       {
           return 1;
       }
       result=n*fact(n-1);
       return result;
    }

}
public class RecursionFactorial
{
    public static void main(String[] args)
    {  
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a number");
          int number;
          number=sc.nextInt();
          Factorial ob=new Factorial();
          System.out.println("the factorial is "+ob.fact(number));
     }

}

