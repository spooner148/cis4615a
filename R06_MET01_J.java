/*
Rule 06
Methods (MET) example 01
Compilation:    javac R06_MET01_J.java
Execution: 	java R06_MET01_J
compliant solution
*/

public class R06_MET01_J {
  
  	public static void main(String[] args){
		int a = 17;
		System.out.println("a = "+a);
		int b = 42;
		System.out.println("b = "+b);
		int c = getAbsAdd(a,b);
		System.out.println("c = "+c);
	}
 
  public static int getAbsAdd(int x, int y) {
    if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
      throw new IllegalArgumentException();
    }
    int absX = Math.abs(x);
    int absY = Math.abs(y);
    if (absX > Integer.MAX_VALUE - absY) {
      throw new IllegalArgumentException();
    }
    return absX + absY;
  }
}
