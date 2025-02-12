package JavaRush0902.DopBlock;
//Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
//Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader - а) этого метода в try..catch.
//Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
//Числа выводить с новой строки сохраняя порядок ввода.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.imageio.IIOException;

public class ReadFromKeyboard {



  public void readData() throws IOException, NumberFormatException {
    List<Integer> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      for (int i = 0; i < 20; i++) {
        System.out.println("Введите число " + (i + 1));
        String input = reader.readLine();
        int number = Integer.parseInt(input);
        list.add(number);
      }
    }catch (IOException | NumberFormatException e) {
        System.out.println("Ошибка при чтении числа: " + e.getMessage());
        System.out.println(list);
      }
    }
  }


