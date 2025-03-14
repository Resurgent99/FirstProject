package javaRush20Solution;
//В классе Solution создайте публичный статический класс AmigoThreadFactory, реализующий интерфейс ThreadFactory
//1.Реализация интерфейсного метода - создайте и верните трэд, который должен:
//1.1. не быть демоном
//1.2. иметь нормальный приоритет
//1.3. имя трэда должно иметь шаблон "GN-pool-A-thread-B", где
//GN - это имя группы,
//A - это номер фабрики инкрементируется в пределах класса начиная с 1, используйте AtomicInteger
//B - номер треда инкрементируется в пределах конкретной фабрики начиная с 1, используйте AtomicInteger
//2.Каждая фабрика должна иметь ту группу тредов (ThreadGroup), в которой она была создана
//3. Методы main и emulateThreadFactory не участвуют в тестировании

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

  public static class AmigoThreadFactory implements ThreadFactory {

    private static final AtomicInteger factoryNumber = new AtomicInteger(0);
    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(0);

    public AmigoThreadFactory() {
      group = Thread.currentThread().getThreadGroup();
    }

    @Override
    public Thread newThread(Runnable r) {
      Thread thread = new Thread(group, r, String.format("%s-pool-%d-thread-%d",
          group.getName(), factoryNumber.incrementAndGet(), threadNumber.incrementAndGet()));

      if (!thread.isDaemon()) {
        thread.setDaemon(false);
      }

      if (thread.getPriority() != Thread.NORM_PRIORITY) {
        thread.setPriority(Thread.NORM_PRIORITY);
      }

      return thread;
    }
  }

  public static void main(String[] args) {

  }

  public static void emulateThreadFactory() {

  }

}
