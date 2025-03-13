
package javaRush28MagicClass;
//В пакете java.util.concurrent найдите такую реализацию List, у которой
//1. итератор не содержит какие-либо данные, вставленные в список после создания итератора
//2. внутри данные хранятся в виде массива
//3. итератор гарантированно не бросает ConcurrentModificationException
//4. допускаются все элементы включая null
//5. Исправьте строку List<String> list = null ... в методе main

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class MagicClass {

  public static void main(String[] args) {
    List<String> list = new CopyOnWriteArrayList<>();

    list.add("Element 1");
    list.add("Element 2");
    list.add("Element 3");

    for (String element : list) {
      System.out.println(element);
    }
  }

}
