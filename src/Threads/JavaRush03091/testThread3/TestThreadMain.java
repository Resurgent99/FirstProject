
package Threads.JavaRush03091.testThread3;

import java.util.ArrayList;
import java.util.List;

public class TestThreadMain {

  public static void main(String[] args) {

    List<Thread> list = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      list.add(new TestThread("Thread" + i));
    }

    for (Thread thread : list) {
      thread.start();
    }


  }

}
