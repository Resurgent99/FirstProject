package JavaRush0902.DopBlock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Написать программу, которая вводит с клавиатуры строку текста.
//Программа должна вывести на экран две строки:
//1) первая строка содержит только гласные буквы
//2) вторая - только согласные буквы и знаки препинания из введённой строки.
//Символы соединять пробелом, каждая строка должна заканчиваться пробелом.
//
//Пример ввода:
//Мама мыла раму.
//Пример вывода:
//а а ы а а у
//М м м л р м .
public class VowelsAndConsonants {
    String vowels = "АЭЫУОЯЕЁЮИаэыуояеёюи";
    String consonants = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ,. ";
    String vowelsOutput = "";
    String consonantsOutput = "";
    Scanner scanner = new Scanner(System.in);

    public void checkVowelsOrConsonants(){
      System.out.println("Введите строку ");
      String input = scanner.nextLine();
      for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (vowels.indexOf(ch) !=-1){
          vowelsOutput += ch + " ";
        }else if (consonants.indexOf(ch) !=-1){
          consonantsOutput += ch + " ";
        }

      }
    }

    public void showString(){
      System.out.println(vowelsOutput);
      System.out.println(consonantsOutput);
    }


}
