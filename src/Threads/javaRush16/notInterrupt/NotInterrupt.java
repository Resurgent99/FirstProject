package Threads.javaRush16.notInterrupt;

public class NotInterrupt extends Thread {
  private volatile boolean running = true;

  @Override
  public void run() {
    while (running) {
      System.out.println("TestThread is running...");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("TestThread has stopped.");
  }

  public void ourInterruptMethod() {
    running = false;
  }
}

