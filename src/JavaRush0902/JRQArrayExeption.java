package JavaRush0902;

//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//int[] m = new int[2];
//m[8] = 5;
public class JRQArrayExeption {

  public void catchExeption() {
    System.out.println("Program starts");
    try {
      System.out.println("Before method1 calling");
      method1();
      System.out.println("After method1 calling. Never will be shown ");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException.Exception has been caught");
    }
    System.out.println("Program is still running");
  }

  public void method1() {
    int[] m = new int[2];
    m[8] = 5;
  }
}
