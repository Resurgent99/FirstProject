
package Threads.JavaRush03091.testThread5;

public class TestThreadMain {

  public static void main(String[] args) {

    Violin violin = new Violin();
    Thread thread = new Thread(violin);
    thread.start();
  }

}
