
package Threads.javaRush16.testThread3;
//3. Список и нити
//
//В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
public class TestThread extends Thread {
  public  TestThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println("Running thread: " + Thread.currentThread().getName());
  }
}
