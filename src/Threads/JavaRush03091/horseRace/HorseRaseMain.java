
package Threads.JavaRush03091.horseRace;

import static Threads.JavaRush03091.horseRace.HorseRace.calculateHorsesFinished;

import java.util.ArrayList;
import java.util.List;

public class HorseRaseMain {

  public static void main(String[] args) {

    List<HorseRace> horses = new ArrayList<>();

    HorseRace horse1 = new HorseRace("Horse1");
    HorseRace horse2 = new HorseRace("Horse2");

    horses.add(horse1);
    horses.add(horse2);

    for (HorseRace horse : horses) {
      Thread thread = new Thread(horse);
      thread.start();
    }


    for (HorseRace horse : horses) {
      try {
        horse.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    int finishedHorses = calculateHorsesFinished(horses);
    System.out.println("Total number of horses finished: " + finishedHorses);
  }

}
