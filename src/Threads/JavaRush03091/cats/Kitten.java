package Threads.JavaRush03091.cats;

public class Kitten implements Runnable {
  private String name;

  public Kitten(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    try{
      System.out.println(name + " is exploring the world");
      Thread.sleep(200);
    }catch (InterruptedException e){
      e.printStackTrace();
    }

  }
}
