package college;

public class Authentication 
{

	public static void main(String[] args) 
	{
		String username, password;
		username ="user123";
		password="pass123";
		if (username =="user13"&& password =="pass123")
		{
			System.out.println("AUTHORIZED LOGIN SUCCESSFUL");
		}
		else if (username=="user1" && password=="pass123")
		{
			System.out.println("INCORRECT USERNAME ");
		}
		else if(username=="user123" && password=="pass1")
		{
			System.out.println("INCORRECT PASSWORD");
		}
		else
		{
			System.out.println("USER NOT REGISTERED");
		}

	}

}
