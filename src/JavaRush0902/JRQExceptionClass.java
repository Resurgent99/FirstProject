package JavaRush0902;

//Есть три исключения последовательно унаследованные от Exception:
//class Exception1 extends Exception
//class Exception2 extends Exception1
//class Exception3 extends Exception2
//Есть метод, который описан так:
//public static void method1() throws Exception1, Exception2, Exception3
//
//Напиши catch, который перехватит все три Exception1, Exception2 и Exception3
public class JRQExceptionClass {

  public void catchException() {
    try {
      System.out.println("Before start");
      method1();
      System.out.println("After method1 calling. This will not be shown");
    } catch (Exception3 e) {
      System.out.println("Exception3 caught");
    } catch (Exception2 e) {
      System.out.println("Exception2 caught");
    } catch (Exception1 e) {
      System.out.println("Exception1 caught");
    }
  }

  public void method1() throws Exception1, Exception2, Exception3 {
    throw new Exception1();
  }
}
