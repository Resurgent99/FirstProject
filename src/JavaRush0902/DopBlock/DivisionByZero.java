package JavaRush0902.DopBlock;

public class DivisionByZero {
  public static void exceptionCatch() throws Exception{
    try{
      System.out.println("Method start");
      byZero();
      System.out.println("After end");
    }catch (ArithmeticException e){
      printStack();
    }
  }

  public static void printStack(){
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements) {
      System.out.println(element.getMethodName());
    }
  }

  public static void byZero(){
    int a =40;
    int b = 0;
    System.out.println(a/b);
  }

}
