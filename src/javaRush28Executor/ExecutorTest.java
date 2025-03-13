
package javaRush28Executor;
//1. В методе main создай фиксированный пул из 5 трэдов используя класс Executors.
//2. В цикле отправь на исполнение в пул 10 тасок Runnable.
//3. У каждой таски в методе run вызови метод doExpensiveOperation с порядковым номером таски начиная с 1, см. пример вывода
//4. Запрети добавление новых тасок на исполнение в пул (метод shutdown)
//5. Дай экзэкьютору 5 секунд на завершение всех тасок (метод awaitTermination и параметр TimeUnit.SECONDS)
//Не должно быть комментариев кроме приведенного output example

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {

  public static void main(String[] args) throws InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(5);

    for (int i = 1; i <= 10; i++) {
      final int taskNumber = i;
      executor.submit(() -> {
        doExpensiveOperation(taskNumber);
      });
    }

    executor.shutdown();
    executor.awaitTermination(5, TimeUnit.SECONDS);
  }

  public static void doExpensiveOperation(int taskNumber) {
    System.out.println("Task " + taskNumber + " is running...");

  }

}
