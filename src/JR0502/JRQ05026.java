package JR0502;
// Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
import java.util.HashSet;
import java.util.Set;

public class JRQ05026 {
    Set<String> set = new HashSet<>();

    public void setCreate(){
        set.add("лодка");
        set.add("Лондон");
        set.add("лимон");
        set.add("лайм");
        set.add("ложка");
        set.add("ложа");
        set.add("лень");
        set.add("лук");
        set.add("лежать");
        set.add("лежанка");
        set.add("лак");
        set.add("лайк");
        set.add("Ливерпуль");
        set.add("лакомство");
        set.add("люк");
        set.add("лукавый");
        set.add("лорд");
        set.add("лёд");
        set.add("лор");
        set.add("ледовый");
    }

    public void showSet21(){
        for (String str : set){
            System.out.println(str);
        }
    }
}
