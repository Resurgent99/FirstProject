
package Threads.javaRush16.stopWatch;

import java.util.Scanner;

public class StopWatch extends Thread {

  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);
    long startTime = System.currentTimeMillis();
    scanner.nextLine();
    long endTime = System.currentTimeMillis();
    long elapsedTime = (endTime - startTime) / 1000;
    System.out.println("Elapsed time: " + elapsedTime);
    scanner.close();
  }
}
