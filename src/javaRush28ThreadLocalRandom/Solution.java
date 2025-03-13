
package javaRush28ThreadLocalRandom;
//Класс Solution будет использоваться трэдами.
//Реализуйте логику всех методов, используйте класс ThreadLocalRandom.
//getRandomIntegerBetweenNumbers должен возвращать случайный int между from и to
//getRandomDouble должен возвращать случайный double
//getRandomLongBetween0AndN должен возвращать случайный long между 0 и n

import java.util.concurrent.ThreadLocalRandom;

public class Solution {

  public static int getRandomIntegerBetweenNumbers(int from, int to) {
    return ThreadLocalRandom.current().nextInt(from, to + 1);
  }

  public static double getRandomDouble() {
    return ThreadLocalRandom.current().nextDouble();
  }

  public static long getRandomLongBetween0AndN(long n) {
    return ThreadLocalRandom.current().nextLong(n + 1);
  }
}
