package JavaRush2901;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaRushQuest29012 {
        Scanner scanner = new Scanner(System.in);
        List<String> massivestring = new ArrayList<>();
        List<Integer> massiveint = new ArrayList<>();

        public void massiveString(){
            for (int i = 0; i < 10; i++){
                System.out.println("Введите строку " + (i + 1));
                massivestring.add(i, scanner.nextLine());
            }
        }

        public void massiveLenSizeIndex(){
            for(int i = 0; i < massivestring.size(); i++){
               massiveint.add(i, massivestring.get(i).length());
            }
        }

        public void showMassive29012(){
            System.out.println(massivestring);
            System.out.println(massiveint);
        }

}
