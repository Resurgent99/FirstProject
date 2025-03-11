
package Threads.javaRush16.debats;

//1. Разберитесь, что делает программа.
//2. Нужно сделать так, чтобы Иванов сказал больше всего речей на политических дебатах.
//3. Подумай, какой метод можно вызвать у объекта ivanov, чтобы Иванов разговаривал, пока не завершится всё свободное время.
public class Debats implements Runnable {

  private int speeches;
  private String name;

  public Debats(String name, int speeches) {
    this.name = name;
    this.speeches = speeches;
  }

  @Override
  public void run() {
    for (int i = 1; i <= speeches; i++) {
      System.out.println(name + " is talking. Speech #" + i);
    }
  }
}


