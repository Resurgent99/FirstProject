package JavaRush0902;
//Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных
// от RuntimeException: NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.
//Нужно перехватить NullPointerException и FileNotFoundException,
// но не перехватывать ArithmeticException и URISyntaxException. Как это сделать?
import java.io.FileNotFoundException;
import java.net.URISyntaxException;


public class JRQManyExeption {
        public void catchExeption(){
            System.out.println("Program starts");
            try {
                System.out.println("Before method1 calling");
                method1();
                System.out.println("After method1 calling. This will not be shown");
            } catch (NullPointerException | FileNotFoundException e) {
                System.out.println("Caught NullPointerException or FileNotFoundException:");
            } catch (RuntimeException e) {
                throw e;
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Program is still running");
        }

        public void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException{
                throw new NullPointerException();
        }
}
