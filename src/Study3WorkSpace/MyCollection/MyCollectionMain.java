package Study3WorkSpace.MyCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyCollectionMain {

  public static void main(String[] args) {
    CarCollection carCollection = new CarCollection();
    carCollection.createCollection();
    carCollection.myOwnCollecxtionIterator();
    carCollection.arrayIterator();
    carCollection.queueIterator();


    }
  }

