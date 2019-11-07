/*rule 06
Methods (MET) example 01
Compilation: javac R06_MET01_J.java
Execution: jaca R06_MET01_J
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
	
	//noncompliant solution
	public static int getAbsAdd(int x, int y){
		assert x != Integer.MIN_VALUE;
		assert y != Integer.MIN_VALUE;
		int absX = Math.abs(x);
		int absY = Math.abs(y);
		assert (absX <= Integer.MAX_VALUE - absY);
		return absX + absY;
	}	
}
