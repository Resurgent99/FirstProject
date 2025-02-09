package JavaRush0902;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//HashMap<String, String> map = new HashMap<String, String>(null);
//map.put(null, null);
//map.remove(null);
public class JRQMapExeption {
    public void catchExeption(){
        System.out.println("Program starts");
        try
        {
            System.out.println("Before method1 calling");
            method1();
            System.out.println("After method1 calling. Never will be shown ");
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException.Exception has been caught");
        }
        System.out.println("Program is still running");
    }

    public void method1()
    {
        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);
    }
}
