package JR0502;
/* Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом. */
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JRQ05029 {
    Map<String, Date> map = new HashMap<>();
    Calendar calendar = Calendar.getInstance();
    public void mapCreate(){
        map.put("Петров", new Date(90, 0,15));
        map.put("Степанцевич", new Date(99,9,1));
        map.put("Федоренко", new Date(90, 6,15));
        map.put("Федоренко", new Date(90, 5,15));
        map.put("Петух", new Date(90, 1,15));
        map.put("Кисель", new Date(90, 8,15));
        map.put("Капрал", new Date(90, 7,15));
        map.put("Валенок", new Date(90, 5,15));
        map.put("Писюн", new Date(90, 6,15));
        map.put("Писька", new Date(90, 3,15));
    }

    public void mapRemove(){
        map.entrySet().removeIf(entry ->{
            calendar.setTime(entry.getValue());
            int month = calendar.get(Calendar.MONTH);
            return month >=Calendar.JUNE && month <= Calendar.AUGUST;
        });
    }

    public void showMap29(){
        for (Map.Entry<String, Date> pair : map.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
