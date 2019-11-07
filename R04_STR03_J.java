/*******************************************
Rule 04
Characters and Strings (STR) example 03
Compilation:   javac R04_STR03_J.java
Execution:     java R04_STR03_J
noncompliant solution
*******************************************/
import java.math.BigInteger;

public class R04_STR03_J {

    public static void main(String[] args){

    BigInteger x = new BigInteger("530500452766");
    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);

    System.out.println("x = "+ x);
    }
}
