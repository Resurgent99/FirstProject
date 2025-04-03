package testStreanGPT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Найти средний возраст пользователей из списка.
public class Main {

  public static void main(String[] args) {
    List<Client> clients = Arrays.asList(
        new Client("Pasha", 13),
        new Client("Sasha", 27),
        new Client("Stas", 34)
    );

    double averageAges = clients.stream()
        .mapToDouble(Client::getAge)
        .average()
        .orElse(0);

    System.out.println(averageAges);
  }

}
