
public class Main1 {
  public static void main(String[] args) {
    TestThread t = new TestThread("A");
    TestThread t2 = new TestThread("  B");
    TestThread t3 = new TestThread("    C");
    t.start();
    t2.start();
    t3.start();
  }
}