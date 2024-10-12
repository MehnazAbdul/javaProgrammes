package college;

public class SwitchString 
{

	public static void main(String[] args) 
	{
		String levelString="expert";
		int level=0;
	   // System.out.println("");
		switch (levelString)
		{
		case "Beginner":
			level=1;
			break;
		case "Intermediate":
			level=2;
			break;
		case "expert":
			level=3;
			break;
		default:
			break;
		}
		System.out.println("your level is "+level);
	}

}
