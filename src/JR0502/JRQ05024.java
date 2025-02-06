package JR0502;
// Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//
//Пример вывода (тут показана только одна строка):
//Sim - 5
import java.util.HashMap;
import java.util.Map;

public class JRQ05024 {
    Map<String, Object> map = new HashMap<>();

    public void mapCreate(){
        map.put("Key1", 10);
        map.put("Key2", true);
        map.put("Key3", 3);
        map.put("Key4", "фрукт");
        map.put("Key5", 3.2);
        map.put("Key6", 124124324);
        map.put("Key7", false);
        map.put("Key8", "ягода");
        map.put("Key9", 11);
        map.put("Key10", "клубень");
    }

    public void showMap24(){
        for (Map.Entry<String, Object> pair : map.entrySet()){
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + "-" + value);
        }
    }
}
