package JR0502;
/* Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию. */
import java.util.HashMap;
import java.util.Map;

public class JRQ05028 {
    Map<String, String> map = new HashMap<>();
    int firstName = 0;
    int secondName = 0;
    String searchName = "Стас";
    String searchSecondName = "Федоренко";
    public void mapCreate(){
        map.put("Петров", "Петя");
        map.put("Степанцевич", "Саша");
        map.put("Федоренко", "Стас");
        map.put("Федоренко", "Николай");
        map.put("Петух", "Дима");
        map.put("Кисель", "Виталик");
        map.put("Капрал", "Сержант");
        map.put("Валенок", "Наташа");
        map.put("Писюн", "Стас");
        map.put("Писька", "Слава");
    }

    public void showMap28(){
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (pair.getValue().equals(searchName)){
                firstName++;
            }
            if (pair.getKey().equals(searchSecondName)){
                secondName++;
            }
        }
        System.out.println(firstName);
        System.out.println(secondName);
    }
}
