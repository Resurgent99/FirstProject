package JavaRush0902.DopBlock;
//Ввести с клавиатуры дату в формате «08/18/2013»
//Вывести на экран эту дату в виде «AUG 18, 2013».
//Воспользоваться объектом Date и SimpleDateFormat.
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConverterDate {
 Scanner scanner = new Scanner(System.in);
  public void converter() throws ParseException {
    System.out.println("Введите дату в формате MM/dd/yyyy");
    String inputDate = scanner.nextLine();
    SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
    Date date = inputFormat.parse(inputDate);
    SimpleDateFormat outputDate = new SimpleDateFormat("MMM dd, yyyy");
    String formattedDate = outputDate.format(date);
    System.out.println(formattedDate);

  }

}
