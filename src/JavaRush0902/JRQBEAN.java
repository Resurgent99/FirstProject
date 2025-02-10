package JavaRush0902;

import java.io.CharConversionException;
import java.nio.file.FileSystemException;

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
public class JRQBEAN {
    /*public void processExceptions(){
        try {
            System.out.println("Before start");
            BEAN.methodThrowExceptions();
            System.out.println("After end");
        }catch (FileSystemException e){
            BEAN.log(e);
            throw e;
            System.out.println("FileSystemException caught");

        }
    }*/

}

