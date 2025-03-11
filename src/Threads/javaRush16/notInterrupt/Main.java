
package Threads.javaRush16.notInterrupt;

//Разберись, как работает программа.
//Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
//Нельзя использовать метод interrupt.
public class Main {

  public static void main(String[] args) {
    NotInterrupt testThread = new NotInterrupt();
    testThread.start();


    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    testThread.ourInterruptMethod();
  }

}
