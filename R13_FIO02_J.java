/*****************************************
Rule 13
Input Output (FIO) example 02
Compilation:    javac R13_FIO02_J.java
Execution: 	    java R13_FIO02_J
compliant solution
*****************************************/
import java.io.File;

public class R13_FIO02_J {
    
    public static void main(String[] args){
       
        File file = new File("filename.txt");
        if (!file.delete()) {
            System.out.println("Deletion failed.");
        } else {
        System.out.println("File deleted.");
        }
    }
}
