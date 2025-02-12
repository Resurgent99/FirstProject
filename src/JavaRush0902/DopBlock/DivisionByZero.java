package JavaRush0902.DopBlock;
//Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
//Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
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
