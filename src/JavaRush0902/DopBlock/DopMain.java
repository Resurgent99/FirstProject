package JavaRush0902.DopBlock;

public class DopMain {

  public static void main(String[] args) {
    /*try {
      DivisionByZero.exceptionCatch();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }*/

    DownCount downCount = new DownCount();
    try {
      downCount.method1();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
