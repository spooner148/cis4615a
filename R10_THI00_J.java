/*****************************************
Rule 10
Thread APIs (THI) example 00
Compilation:    javac R10_THI00_J.java
Execution: 	    java R10_THI00_J
compliant solution
*****************************************/

public final class R10_THI00_J implements Runnable {
  
  @Override public void run() {
    System.out.println("running thread.");
  }
 
  public static void main(String[] args) {
    R10_THI00_J foo = new R10_THI00_J();
    new Thread(foo).start();
  }
}
