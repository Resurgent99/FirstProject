package JavaRush0202;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaRushQuest02021 {
    List<String> array = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void setArray(){
        for (int i = 0; i < 5; i++){
            System.out.println("Введите строку " + (i+1));
            array.add(scanner.nextLine());
        }
    }

    public void showArray02021(){
        System.out.println("Размер массива " + array.size());
        for(int i = 0; i < array.size(); i++){
            System.out.println("Элемент массива " + (i + 1) + " " + array.get(i));
        }
    }
}
