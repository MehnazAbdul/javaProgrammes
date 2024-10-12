package college;


public class SocreCardIf {

	public static void main(String[] args)
	{
         int marks=15;
         if(marks>=90) 
         {
        	 System.out.println("A+ GRADE");
         }
         else  if (marks >=85 && marks <90)
         {
        	 System.out.println("A grade");
         }
         else if(marks>=79 && marks <85)
         {
        	 System.out.println("B grade");
         }
         else if (marks>=64 && marks <79)
         {
        	 System.out.println("B+ grade");
         }
         else if(marks >=48 && marks <64)
         {
        	 System.out.println("C grade");
         }
         else 
         {
        	System.out.println(".........MEET THE PRINCIPAL..........");
         }
	}

}
