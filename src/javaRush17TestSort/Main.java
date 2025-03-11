
package javaRush17TestSort;

//1. Разберись, что и как работает
//2. Создай public static нить SortThread, которая в методе run отсортирует статический массив testArray используя метод sort
public class Main {

  public static void main(String[] args) {
    TestSort testSort = new TestSort();
    testSort.start();
  }

}
