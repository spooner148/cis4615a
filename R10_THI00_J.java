//rule 10
//Thread APIs (THI) example 00
//compliant solution


public final class Foo implements Runnable {
  @Override public void run() {
    // ...
  }
 
  public static void main(String[] args) {
    Foo foo = new Foo();
    new Thread(foo).start();
  }
}
