package JR0502;

import java.util.HashMap;
import java.util.Map;

// Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
//Вывести на экран список ключей, каждый элемент с новой строки.
public class JRQ05023 {
    Map<String, String> map = new HashMap<>();

    public void mapCreate(){
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");
    }

    public void showMap23(){
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            System.out.println("Ключ : " + key);
        }
    }
}
