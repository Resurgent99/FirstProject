
package Threads.javaRush16.testThread4;

public class TestThreadMain {

  public static void main(String[] args) {
    TestThread testThread = new TestThread();
    Thread thread = new Thread(testThread);
    thread.start();

  }

}
