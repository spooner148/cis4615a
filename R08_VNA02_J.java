/*****************************************
Rule 08
Visibility and Atomicity (VNA) example 02
Compilation:    javac R08_VNA08_J.java
Execution: 	    java R08_VNA08_J
compliant solution
*****************************************/

final class Flag {
  private boolean flag = true;
 
  public synchronized void toggle() {
    flag ^= true; // Same as flag = !flag;
  }
 
  public synchronized boolean getFlag() {
    return flag;
  }
}

class multi implements Runnable{
  private Flag flag;

  public multi(Flag flag){
    this.flag = flag;
  }

  @Override
  public void run(){
    flag.toggle();
    System.out.println("thread is running...");
  }
}

public class R08_VNA02_J {
  public static void main(String[] args){
    Flag flag = new Flag();

    Thread t1 = new Thread(new multi(flag));
    Thread t2 = new Thread(new multi(flag));
    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    } catch (Exception e) {}

  }

}
