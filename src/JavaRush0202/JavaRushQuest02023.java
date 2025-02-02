package JavaRush0202;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaRushQuest02023 {
    List<String> array = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    List<String> minArrayString = new ArrayList<>();
    public void setArray02023(){
        for (int i = 0; i < 5; i++){
            System.out.println("Введите строку " + (i+1));
            array.add(scanner.nextLine());
        }
    }

    public void minLengthString(){
        int minLength = 10000000;
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).length() < minLength){
                minLength = array.get(i).length();
                minArrayString.clear();
                minArrayString.add(array.get(i));
            }else if (array.get(i).length() == minLength) {
                minArrayString.add(array.get(i));
            }
        }
    }

    public void showMinElement02023(){
        for (String str : minArrayString) {
            System.out.println("Все минимальные элементы массива: " + str);
        }
    }
}
