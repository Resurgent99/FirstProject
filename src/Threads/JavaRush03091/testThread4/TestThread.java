
package Threads.JavaRush03091.testThread4;
//1. Создать таск - класс public static SpecialThread - на основании интерфейса Runnable
//2. SpecialThread должен выводить в консоль свой стек-трейс.
//
//Подсказка: main thread уже выводит в консоль свой стек-трейс.
public class TestThread implements Runnable {


  @Override
  public void run() {

    Thread currentThread = Thread.currentThread();
    StackTraceElement[] stackTrace = currentThread.getStackTrace();

    System.out.println("Stack trace of SpecialThread:");
    for (StackTraceElement element : stackTrace) {
      System.out.println(element.toString());
  }

  }
}
