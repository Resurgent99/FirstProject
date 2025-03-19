package testStreamGPT1;
//Преобразовать список строк в верхний регистр и собрать их в новый список.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("dfgdsvf");
    list.add("fasdfg");
    list.add("asdfg");
    list.add("dfghj");
    list.add("bnkhjk");

    List<String> upperRegister = list.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
    System.out.println(upperRegister);
  }

}
