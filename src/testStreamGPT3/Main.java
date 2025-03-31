package testStreamGPT3;
//Сгруппировать пользователей по полу и подсчитать количество пользователей каждого пола.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Users> list = Arrays.asList(
        new Users("Alex", Sex.MAN),
        new Users("Yana", Sex.WOMAN),
        new Users("Bob", Sex.MAN),
        new Users("Kate", Sex.WOMAN)
    );

    Map<Sex, Long> countSex = list.stream()
        .collect(Collectors.groupingBy(Users::getSex, Collectors.counting()));

    System.out.println(countSex);
  }

}
