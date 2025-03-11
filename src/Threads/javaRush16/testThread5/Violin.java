
package Threads.javaRush16.testThread5;
//1. Измените класс Violin так, чтоб он стал таском для нити. Используйте интерфейс MusicalInstrument
//2. Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
//2.1. Считай время начала игры - метод startPlaying().
//2.2. Подожди 1 секунду - метод sleepNSeconds(int n), где n - количество секунд.
//2.3. Считай время окончания игры - метод stopPlaying().
//2.4. Выведи на консоль продолжительность игры в миллисекундах. Пример "Playing 1002 ms".
public class Violin implements MusicalInstrument, Runnable {

  private long startTime;

  @Override
  public void startPlaying() {
    startTime = System.currentTimeMillis();
    System.out.println("Started playing violin.");
  }

  @Override
  public void stopPlaying() {
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    System.out.println("Playing " + duration + " ms");
  }

  @Override
  public void sleepNSeconds(int n) {

  }

  @Override
  public void run() {
    startPlaying();
    sleepNSeconds(1);
    stopPlaying();
  }
}
