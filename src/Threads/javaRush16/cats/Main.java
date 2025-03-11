
package Threads.javaRush16.cats;

import java.util.ArrayList;
import java.util.List;

//1. Разберитесь, что делает программа.
//2. Расставь вызовы методов join() так, чтобы для каждой кошки выполнялось следующее:
//2.1. Сначала кошка рожает котят.
//2.2. Потом все котята вылазят из корзинки в произвольном порядке.
//2.3. В конце кошка собирает их назад в корзинку.
//2.4. Все события для одной кошки могут быть перемешаны с событями для другой кошки.
//2.5. Добавить сон котят (200 мс) в investigateWorld
public class Main {

  public static void main(String[] args) {
    List<Cat> cats = new ArrayList<>();

    Cat cat1 = new Cat("Cat 1");


    cats.add(cat1);


    for (Cat cat : cats) {
      Thread catThread = new Thread(cat);
      catThread.start();
    }
  }

}
