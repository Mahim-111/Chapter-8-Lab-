package exercise26;


import java.util.Scanner;

public class LoginFormTester
{
	public static void main(String[] args)
	{
		LoginForm form = new LoginForm("Mahim", "ILoveYou");
		Scanner in = new Scanner(System.in);
		
		while(!form.loggedIn())
		{
			System.out.println("Login Form");
			
			System.out.print("Enter Username: ");
			String userName = in.next();
			form.input("Username", userName);
			
			System.out.print("Enter Password: ");
			String password = in.next();
			
			form.input("Password", password);
			
			// Click "Submit"
			form.click("Submit");
		}
		
		System.out.println("Login Successful");
		
		in.close();
	}
}
