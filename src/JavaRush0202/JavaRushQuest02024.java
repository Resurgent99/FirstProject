package JavaRush0202;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaRushQuest02024 {
    List<String> array = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void setArray02024(){
        for (int i = 0; i < 10; i++){
            System.out.println("Введите строку " + (i+1));
            array.add(0, scanner.nextLine());
        }
    }

    public void showArray02024(){
        for (String str : array) {
            System.out.println("Элемент " + str);
        }
    }
}
