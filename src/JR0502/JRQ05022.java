package JR0502;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//
//Пример вывода (тут показана только одна строка):
//картофель – клубень
public class JRQ05022 {
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

    public void showMap22(){
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + "-" + value);
        }
    }
}
