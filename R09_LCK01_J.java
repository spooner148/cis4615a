//rule 09
//Locking (LCK) example 01
//compliant solution


private int count = 0;
private final Integer Lock = new Integer(count);
 
public void doSomething() {
  synchronized (Lock) {
    count++;
    // ...
  }
}
