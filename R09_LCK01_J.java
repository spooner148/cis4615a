//rule 09
//Locking (LCK) example 01
//noncompliant solution


private final Boolean initialized = Boolean.FALSE;
 
public void doSomething() {
  synchronized (initialized) {
    // ...
  }
}