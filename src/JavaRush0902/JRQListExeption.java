package JavaRush0902;

import java.util.ArrayList;
import java.util.List;

//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//ArrayList<String> list = new ArrayList<String>();
//String s = list.get(18);
public class JRQListExeption {

    public void catchExeption() {
        System.out.println("Program starts");
        try {
            System.out.println("Before method1 calling");
            method1();
            System.out.println("After method1 calling. Never will be shown ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException.Exception has been caught");
        }
        System.out.println("Program is still running");
    }

    public void method1() {
        List<String> list = new ArrayList<String>();
        String s = list.get(18);
    }
}
