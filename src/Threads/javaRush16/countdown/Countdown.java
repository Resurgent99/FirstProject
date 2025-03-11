
package Threads.javaRush16.countdown;

public class Countdown extends Thread {

  private int countSeconds;

  public Countdown(int countSeconds) {
    this.countSeconds = countSeconds;
  }

  @Override
  public void run() {
    long startTime = System.currentTimeMillis();

    try {
      for (int i = countSeconds; i > 0; i--) {
        System.out.print(i + " ");
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Прервано!");
      return;
    }

    long endTime = System.currentTimeMillis();
    long elapsedTime = (endTime - startTime) / 1000;

    if (elapsedTime < 3.5) {
      System.out.println("Марш!");
    } else {
      System.out.println("Прервано!");
      this.interrupt();
    }
  }
}

