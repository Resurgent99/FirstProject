package JavaRush0902;
//3. Перехват выборочных исключений
//
//1. Разберись, какие исключения бросает метод BEAN.methodThrowExceptions.
//2. Метод processExceptions должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения:
//2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
//2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его - вызвать метод BEAN.log
//3. Добавь в сигнатуру метода processExceptions класс исключения, которое ты пробрасываешь в п.2.1.
//4. В методе main обработай оставшееся исключение - логируй его. Используй try..catch
//
//Подсказка:
//Если ты захватил исключение MyException, которое не хотел захватывать, его можно пробросить дальше кодом вида:
//catch (MyException e) {
//   throw e;
//}
//4. Перехват checked исключений
//
//В методе processExceptions обработайте все checked исключения.
//Нужно вывести на экран каждое возникшее checked исключение.
//Можно использовать только один блок try.
//5. Перехват unchecked исключений
//
//В методе processExceptions обработайте все unchecked исключения.
//Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
//Можно использовать только один блок try.
import java.io.CharConversionException;
import java.io.IOException;
import java.net.SocketException;
import java.nio.file.FileSystemException;

public class BEAN {

  public void processExceptions() throws Exception {
    try {
      System.out.println("Before start");
      methodThrowExceptions(4);
      System.out.println("After end");
    } catch (FileSystemException e) {
      System.out.println("произошло исключение FileSystemException " );
      log(e);
      throw e;
    } catch (SocketException e) {
      System.out.println("Exception was caught ");
      log(e);
    } catch (NumberFormatException e) {
      System.out.println("Exception was caught ");
      log(e);
      printStack();
    } catch (IllegalArgumentException e) {
      System.out.println("Exception was caught ");
      log(e);
      printStack();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception was caught ");
      log(e);
      printStack();
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Exception was caught ");
      log(e);
      printStack();
    } catch (ArithmeticException e) {
      System.out.println("Exception was caught ");
      log(e);
      printStack();
    }
  }

  public static void log(Exception e) {
    System.out.println("Exception logged: " + e.getMessage());
  }

  public void methodThrowExceptions(int i) throws Exception {
    switch (i){
      case 1:
        throw new FileSystemException("File not found");
      case 2:
        throw new SocketException("Connection reset");
      case 3:
        throw new IllegalArgumentException("IllegalArgumentException caught");
      case 4:
        throw new IndexOutOfBoundsException("IndexOutOfBoundsException caught");
      case 5:
        throw new NumberFormatException("NumberFormatException caught");
      case 6:
        throw new ArithmeticException("ArithmeticException caught");
      case 7:
        throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException caught");
    }

  }

  public void printStack(){
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements) {
      System.out.println(element.getMethodName());
    }
  }
}