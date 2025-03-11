package Threads.javaRush16.cats;

import java.util.ArrayList;
import java.util.List;

public class Cat implements Runnable{
  private String name;

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public void run() {
      try {
        System.out.println(name + " is giving birth to kittens");
        Thread.sleep(1000);

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i <= 3; i++){
          Thread thread = new Thread(new Kitten("Kitten #" + i));
          threads.add(thread);
          thread.start();
        }
        for (Thread thread : threads){
          thread.join();
        }
        System.out.println(name + " is gathering kittens back to the basket.");
      }catch (InterruptedException e){
        e.printStackTrace();
      }
  }
}
