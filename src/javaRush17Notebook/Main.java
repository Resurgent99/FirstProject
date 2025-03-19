package javaRush17Notebook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//1. Класс Note будет использоваться нитями.
//2. Создай public static нить NoteThread (Runnable не является нитью), которая в методе run 1000 раз (index = 0-999) сделает следующие действия:
//2.1. используя метод addNote добавит заметку с именем [getName() + "-Note" + index], например, при index=4
//"Thread-0-Note4"
//2.2. используя метод removeNote удалит заметку
//2.3. в качестве первого параметра в removeNote передай имя нити - метод getName()
public class Main {

  public static void main(String[] args) {
    // Note note = new Note();
    List<String> list = new ArrayList<>();
    list.add("Java1");
    list.add("Java2");
    list.add("Java3");
    list.add("Jav4");
    list.add("Java5");
    list.add("Java6");
    list.add("Java7");
    List<String> list2 = list.stream()
        .filter(x -> x.contains("Java"))
        .map(Main::fillString)
        .sorted(
            Comparator.comparing(String::toString, Comparator.nullsLast(Comparator.reverseOrder())))
        .toList();
    list2.forEach(System.out::println);
  }
  private static String fillString(String str){
    return str + " Sasha";
  }
}
