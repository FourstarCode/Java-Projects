package topic8Exercises;


public class JFT8Ex10
{
	public static void main(String[] args)
	{
		String passwords[] = {"oxymoran", "poxedfox", "kingfisher", "cruiseshipper"};
		String userPassword = "cruiseshipper";
		
		boolean password = false;
		
		for(String pass : passwords)
		{
			if(pass.equals(userPassword))
			{
				System.out.println("Log-On Successful");
				password = true;
				break;
			}
		}
		if (!password)
		{
			System.out.println("You cannot be logged on using the specified password");
		}
	}
}
			