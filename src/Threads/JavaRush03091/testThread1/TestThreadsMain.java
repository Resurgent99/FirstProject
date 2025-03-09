package Threads.JavaRush03091.testThread1;

public class TestThreadsMain{

  public static void main(String[] args) {
    TestThread t = new TestThread();
    Thread childThread = new Thread(t);
    childThread.start();
  }

}
