//rule 10
//Thread APIs (THI) example 00
//noncompliant solution


public final class Foo implements Runnable {
  @Override public void run() {
    // ...
  }
 
  public static void main(String[] args) {
    Foo foo = new Foo();
    new Thread(foo).run();
  }
}