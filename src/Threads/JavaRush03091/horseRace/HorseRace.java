
package Threads.JavaRush03091.horseRace;
//Разберись, что делает программа.
//Реализуй метод calculateHorsesFinished. Он должен:
//1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
//2. Если лошадь еще не пришла к финишу (!isFinished()), то:
//2.1. Вывести в консоль "Waiting for " + horse.getName().
//2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
import java.util.List;

public class HorseRace extends Thread{

  private String name;

  public HorseRace(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    try {
      Thread.sleep(3000); // Имитация времени гонки
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public String getHorseName() {
    return name;
  }

  public boolean isFinished() {
    return true;
  }

  public static int calculateHorsesFinished(List<HorseRace> horses) {
  int count = 0;

  for (HorseRace horse : horses) {
    if (!horse.isFinished()) {
      System.out.println("Waiting for " + horse.getName());

      try {
        horse.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    } else {
      count++;
    }
  }

  return count;
}

}
