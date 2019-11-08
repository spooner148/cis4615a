/*****************************************
Rule 05
Object Orientation (OBJ) example 03
Compilation:    javac R05_OBJ03_J.java
Execution: 	    java R05_OBJ03_J
compliant solution
*****************************************/
import java.util.ArrayList;
import java.util.List;
  
public class R05_OBJ03_J {

	private static void addToList(List<String> list, String str) {
		list.add(str);     // No warning generated
	}
 
  public static void main(String[] args) {
    List<String> list = new ArrayList<String> ();
    addToList(list, "42");
    System.out.println(list.get(0));  // Throws ClassCastException
  }
}
