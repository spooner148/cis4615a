/***********************************************
Rule 07
Exceptional Behavior (ERR) example 01
Compilation:   javac R07_ERR01_J.java
Execution:     java R07_ERR01_J
noncompliant solution
************************************************/
import java.io.File;
import java.io.*;
import java.util.Scanner;

public class R07_ERR01_J {
	public static void main(String[] args) throws FileNotFoundException {
   
		System.out.print("Enter file name:");
		Scanner in = new Scanner(System.in);
		String filename = in.nextLine();

		// Linux stores a user's home directory path in
		// the environment variable $HOME, Windows in %APPDATA%
		FileInputStream fis =
			new FileInputStream(System.getenv("APPDATA") + filename); 
		}
	
	}
  
