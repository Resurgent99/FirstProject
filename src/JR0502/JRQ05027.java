package JR0502;

import java.util.HashSet;
import java.util.Set;

//Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//Удалить из множества все числа больше 10.
public class JRQ05027 {
    Set<Integer> set = new HashSet<>();

    public void setCreate(){
        set.add(1);
        set.add(123);
        set.add(20);
        set.add(10);
        set.add(5);
        set.add(7);
        set.add(96);
        set.add(543);
        set.add(3);
        set.add(643);
        set.add(640);
        set.add(64);
        set.add(6);
        set.add(0);
        set.add(98);
        set.add(100);
        set.add(13);
        set.add(15);
        set.add(17);
        set.add(99);

    }

    public void showSet26(){
        set.removeIf(num -> num >10);
        for (int str : set){
            System.out.println(str);
        }
    }
}
