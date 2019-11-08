/*********************************************************
Rule 00
Input Validation and Data Sanitization (IDS) example 03
Compilation:   javac R00_IDS03_J.java
Execution:     java R00_IDS03_J
noncompliant solution
**********************************************************/
import java.util.regex.Pattern;
import java.util.logging.*;
import java.util.Scanner;

public class R00_IDS03_J {

	static Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());

	public static void main(String[] args) {
		boolean loginSuccessful = true;

		//get username
		System.out.print("Enter Username:");
		Scanner in = new Scanner(System.in);
		String username = in.nextLine();

		if (loginSuccessful){
			logger.severe("User login Succeeded for: " + username);
		} else {
			logger.severe("User login failed for: " + username);
		}
		
		in.close();
	}
}
