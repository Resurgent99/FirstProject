package Threads.JavaRush03091.testThread2;

public class TestThread2 extends Thread {
  static {
    System.out.println("it's static block inside TestThread");
  }

  @Override
  public void run() {
    System.out.println("it's run method");
  }

}
