package JavaRush0902;

//Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
public class JRQReturnStackTrace {

  public void method1() {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements) {
      System.out.println(element.getMethodName());
    }
    method2();
  }

  public void method2() {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements) {
      System.out.println(element.getMethodName());
    }
    method3();
  }

  public void method3() {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements) {
      System.out.println(element.getMethodName());
    }
    method4();
  }

  public void method4() {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements) {
      System.out.println(element.getMethodName());
    }
    method5();
  }

  public void method5() {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements) {
      System.out.println(element.getMethodName());
    }
  }
}
