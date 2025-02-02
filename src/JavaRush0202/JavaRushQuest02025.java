package JavaRush0202;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaRushQuest02025 {
    List<String> array = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void setArray02025(){
        for (int i = 0; i < 5; i++){
            System.out.println("Введите строку " + (i+1));
            array.add(scanner.nextLine());
        }
    }

    public void updateArray(){
        for(int i = 0; i < 13; i++){
            String lastElement = array.getLast();
            array.remove(array.getLast());
            array.add(0,lastElement);

        }
    }
    public void showArray02025(){
        for (String str : array) {
            System.out.println("Элемент " + str);
        }
    }
}
