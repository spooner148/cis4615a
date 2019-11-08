/***********************************************
Rule 03
Numeric Types and Operations (NUM) example 03
Compilation:   javac R03_NUM03_J.java
Execution:     java R03_NUM03_J
compliant solution
************************************************/
import java.io.*;

public class R03_NUM03_J{
	
	public static void main(String[] args) throws IOException {

		System.out.println("check1");
		DataInputStream is = new DataInputStream(System.in);
		System.out.println("Integer =" + getInteger(is));
		is.close();
	}

	public static long getInteger(DataInputStream is) throws IOException {
		return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
	  }
}
