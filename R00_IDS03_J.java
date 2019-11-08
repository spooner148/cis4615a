/*********************************************************
Rule 00
Input Validation and Data Sanitization (IDS) example 03
Compilation:   javac R00_IDS03_J.java
Execution:     java R00_IDS03_J
compliant solution
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
			logger.severe("User login succeeded for: " + sanitizeUser(username));
	  	} else {
			logger.severe("User login failed for: " + sanitizeUser(username));
	  	}

		in.close();
	}

	public static String sanitizeUser(String username) {
		return Pattern.matches("[A-Za-z0-9_]+", username)
			? username : "unauthorized user";
	  }
}
