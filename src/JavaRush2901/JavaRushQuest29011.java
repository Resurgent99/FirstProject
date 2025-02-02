package JavaRush2901;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
//Сделал вывод элементов рекурсией и стэком!!
public class JavaRushQuest29011 {
    Scanner scanner = new Scanner(System.in);
    String[] text = new String[10];
    Stack<String> stack = new Stack();
    public String[] massive(){
        for(int i = 0; i < 10; i++){
            System.out.println("Введённая строка " +(i +1));
            text[i] = scanner.nextLine();
        }
        return text;
    }

    public void showMassive(){
        for(int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }

    public void massiveRecurcive(){
        for(int index = 10; index >= 0; index--) {
            if (index < text.length) {
                String temp = text[index];
                System.out.println(temp);
            }
        }
    }


     public void massiveInicialiseStack(){
        for(int i = 0; i < text.length; i++) {
            String temp = text[i];
            stack.push(temp);
        }
    }
}
