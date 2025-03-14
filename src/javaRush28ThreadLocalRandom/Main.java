
package javaRush28ThreadLocalRandom;

import static javaRush28ThreadLocalRandom.Solution.getRandomDouble;
import static javaRush28ThreadLocalRandom.Solution.getRandomIntegerBetweenNumbers;
import static javaRush28ThreadLocalRandom.Solution.getRandomLongBetween0AndN;

public class Main {

  public static void main(String[] args) {
    int randomInt = getRandomIntegerBetweenNumbers(1, 10);
    double randomDouble = getRandomDouble();
    long randomLong = getRandomLongBetween0AndN(100);

    System.out.println("Random Integer between 1 and 10: " + randomInt);
    System.out.println("Random Double: " + randomDouble);
    System.out.println("Random Long between 0 and 100: " + randomLong);
  }

}
