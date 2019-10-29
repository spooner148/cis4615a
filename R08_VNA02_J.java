//rule 08
//Visibility and Atomicity (VNA) example 02
//noncompliant solution


final class Flag {
  private boolean flag = true;
 
  public void toggle() {  // Unsafe
    flag = !flag;
  }
 
  public boolean getFlag() { // Unsafe
    return flag;
  }
}