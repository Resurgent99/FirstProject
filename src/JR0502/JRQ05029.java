package JR0502;
/* Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом. */
import java.time.LocalDate;
import java.util.*;

public class JRQ05029 {
    Map<String, LocalDate> map = new HashMap<>();
    Calendar calendar = Calendar.getInstance();
    public void mapCreate(){
        map.put("Петров", LocalDate.of(1990, 1, 15));
        map.put("Степанцевич", LocalDate.of(99,9,1));
        map.put("Федоренко", LocalDate.of(90, 6,15));
        map.put("Федоренко", LocalDate.of(90, 5,15));
        map.put("Петух", LocalDate.of(90, 1,15));
        map.put("Кисель", LocalDate.of(90, 8,15));
        map.put("Капрал", LocalDate.of(90, 7,15));
        map.put("Валенок", LocalDate.of(90, 5,15));
        map.put("Писюн", LocalDate.of(90, 6,15));
        map.put("Писька", LocalDate.of(90, 3,15));
    }

    public void mapRemove(Map<String, LocalDate> map) {
        Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> entry = iterator.next();
            int month = entry.getValue().getMonthValue();

            if (month >= 6 && month <= 8) {
                iterator.remove();
            }
        }
    }

    public void showMap29(){
        for (Map.Entry<String, LocalDate> pair : map.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
