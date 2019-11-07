/***************************************
Rule 02
Expressions (XP) example 00
Compilation:   javac R02_XP00_J.java
Execution:     java R02_XP00_J
noncompliant solution
****************************************/
import java.io.*;

public class R02_XP00_J {

	public static void main(String[] args){
		deleteFile();
	}

	public static void deleteFile() {
		File someFile = new File ("someFileName.txt");
		//Do something with someFile
		System.out.println(someFile +" created");
		
		someFile.delete();

	}
}
