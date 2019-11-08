/***********************************************
Rule 07
Exceptional Behavior (ERR) example 01
Compilation:   javac R07_ERR01_J.java
Execution:     java R07_ERR01_J
compliant solution
************************************************/
import java.io.File;
import java.io.*;
import java.util.Scanner;

public class R07_ERR01_J {
	public static void main(String[] args) {
   
		System.out.print("Enter file name:");
		Scanner in = new Scanner(System.in);
		String filename = in.nextLine();

	  File file = null;
	  
	  try {
		file = new File(System.getenv("APPDATA") + filename).getCanonicalFile();
		if (!file.getPath().startsWith("c:\\homepath")) {
		  System.out.println("Invalid file");
		  return;
		}
	  } catch (IOException x) {
		System.out.println("Invalid file");
		return;
	  }
   
	  try {
		FileInputStream fis = new FileInputStream(file);
	  } catch (FileNotFoundException x) {
		System.out.println("Invalid file");
		return;
	  }
	  in.close();
	}
  }
