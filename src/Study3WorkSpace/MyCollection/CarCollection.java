package Study3WorkSpace.MyCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class CarCollection implements CarImpl{
  List<CarImpl> carList = new ArrayList<>();
  Queue<CarImpl> carQueue = new LinkedList<>();
  MyOwnCollection<CarImpl> carMyOwnCollection = new OwnCollection<>();

    public void createCollection(){
      Random rand = new Random();
      for (int i = 0; i < 10; i++) {
        CarImpl lamba = new Lamba();
        carList.add(lamba);
        carQueue.add(lamba);
        carMyOwnCollection.add(lamba);
      }
    }

    public void arrayIterator() {
      System.out.println("Использование Iterable и Iterator со списком ArrayList:");
      for (CarImpl lamba : carList) {
        System.out.println(lamba);
      }

      Iterator<CarImpl> iterator = carList.iterator();
      while (iterator.hasNext()) {
        CarImpl lamba = iterator.next();
        System.out.println(lamba);
      }
    }

      public void queueIterator () {
        System.out.println("Использование Iterable и Iterator со списком Queue");
        for (CarImpl car : carQueue) {
          System.out.println(car);
        }

        Iterator<CarImpl> iterator = carQueue.iterator();
        while (iterator.hasNext()) {
          CarImpl car = iterator.next();
          System.out.println(car);
        }
      }

        public void myOwnCollecxtionIterator () {
          System.out.println("Использование Iterable и Iterator со списком MyOwnCollection:");
          for (CarImpl car : carMyOwnCollection) {
            System.out.println(car);
          }

          Iterator<CarImpl>iterator = carMyOwnCollection.iterator();
          while (iterator.hasNext()) {
            CarImpl car = iterator.next();
            System.out.println(car);
          }
        }



}
