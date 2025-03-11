
package Threads.javaRush16.stopWatch;

//1. Напиши реализацию метода run в нити Stopwatch (секундомер).
//2. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
//3. Выведи количество секунд в консоль.
public class Main {

  public static void main(String[] args) {

    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
  }

}
