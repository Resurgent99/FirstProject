package JR0502;

import java.util.HashSet;
import java.util.Set;

// Создать коллекцию HashSet с типом элементов String.
//Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//Посмотреть, как изменился порядок добавленных элементов.
public class JRQ05021 {
    Set<String> set = new HashSet<>();

    public void setCreate(){
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
    }

    public void showSet21(){
        for (String str : set){
            System.out.println(str);
        }
    }
}
