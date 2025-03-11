
package Threads.javaRush16.debats;

public class DebatsMain {

  public static void main(String[] args) {

    Debats ivanov = new Debats("Ivanov", 3);
    Debats petrov = new Debats("Petrov", 2);

    Thread ivanovThread = new Thread(ivanov);
    Thread petrovThread = new Thread(petrov);

    ivanovThread.start();
    petrovThread.start();

    try {
      ivanovThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Debates are over!");
  }

}
