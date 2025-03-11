
package javaRush17TestSort;

import java.util.Arrays;

public class TestSort extends Thread {

  private static int[] testArray = {4, 2, 7, 1, 3};

  @Override
  public void run() {
    System.out.println("Before sorting: " + Arrays.toString(testArray));
    Arrays.sort(testArray);
    System.out.println("After sorting: " + Arrays.toString(testArray));
  }
}
