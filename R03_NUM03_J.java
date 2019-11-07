/***********************************************
Rule 03
Numeric Types and Operations (NUM) example 03
Compilation:   javac R03_NUM03_J.java
Execution:     java R03_NUM03_J
noncompliant solution
************************************************/
import java.io.*;

public class R03_NUM03_J{

	public static void main(String[] args) throws IOException {
		DataInputStream is = new DataInputStream(System.in);
		System.out.println("Integer =" + getInteger(is));
	}

	public static int getInteger(DataInputStream is) throws IOException {
		return is.readInt();
	}
}
