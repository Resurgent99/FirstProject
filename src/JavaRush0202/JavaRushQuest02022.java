package JavaRush0202;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaRushQuest02022 {
        List<String> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        List<String> largestString = new ArrayList<>();
        public void setArray02022(){
            for (int i = 0; i < 5; i++){
                System.out.println("Введите строку " + (i+1));
                array.add(scanner.nextLine());
            }
        }

        public void maxLengthString(){
            int maxLength = 0;
            for (int i = 0; i < array.size(); i++){
                if (array.get(i).length() > maxLength){
                    maxLength = array.get(i).length();
                    largestString.clear();
                    largestString.add(array.get(i));
                }else if (array.get(i).length() == maxLength) {
                    largestString.add(array.get(i));
                }
            }
        }

        public void showMaxElement(){
            for (String str : largestString) {
                System.out.println("Все максимальные элементы массива: " + str);
            }
        }

}
