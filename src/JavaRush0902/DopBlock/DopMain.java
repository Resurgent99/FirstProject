package JavaRush0902.DopBlock;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;

public class DopMain {

  public static void main(String[] args) {
    /*try {
      DivisionByZero.exceptionCatch();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }*/

    /*DownCount downCount = new DownCount();
    try {
      downCount.method1();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }*/

   /* ReadFromKeyboard readFromKeyboard = new ReadFromKeyboard();
    try {
      readFromKeyboard.readData();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }*/

    ConverterDate converterDate = new ConverterDate();
    try {
      converterDate.converter();
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }

    /*VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
    vowelsAndConsonants.checkVowelsOrConsonants();
    vowelsAndConsonants.showString();*/


  }
}
