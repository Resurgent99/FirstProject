
package Threads.javaRush16.testThread6;

public class TestThreadMain {

  public static void main(String[] args) throws InterruptedException {

    Thread firstThread = new Thread(new TestThreads("First Thread"));
    Thread secondThread = new Thread(new TestThreads("Second Thread"));
    firstThread.start();
    firstThread.join();
    secondThread.start();
    secondThread.join();

  }

}
