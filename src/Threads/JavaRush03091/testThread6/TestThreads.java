
package Threads.JavaRush03091.testThread6;

import java.util.concurrent.Semaphore;

//Подумайте, в каком месте и для какого объекта нужно вызвать метод join,
// чтобы результат выводился по-порядку сначала для firstThread, а потом для secondThread.
//Вызовите метод join в нужном месте.
public class TestThreads extends Thread {

  private String name;

  public TestThreads(String name) {
    this.name = name;
  }

  @Override
  public void run() {

    for (int i = 1; i <= 5; i++) {
      System.out.println(name + ": " + i);
    }
  }
}
