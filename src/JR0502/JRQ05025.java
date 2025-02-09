package JR0502;
// 1. Создать два списка LinkedList & ArrayList.
//
//Нужно создать два списка – LinkedList и ArrayList.
//2. Провести 10 тысяч вставок, удалений
//
//Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
//3. Измерить сколько времени занимает 10 тысяч вставок для каждого списка
//
//Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
//Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.
//4. Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
//
//Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
//Метод getTimeMsOfGet должен вернуть время его исполнения в миллисекундах.
//5. Четыре метода
//
//Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JRQ05025 {
    List<Integer> arraylist = new ArrayList<>();
    List<Integer> linckedlist = new LinkedList<>();

    public void arrayListCreate(){
        int n = 0;
        for (int i = 0; i < 10000; i++){
            n++;
            arraylist.add(n);
        }
    }

    public void linckedListCreate(){
        int n = 0;
        for (int i = 0; i < 10000; i++){
            n++;
            linckedlist.add(n);
        }
    }

    public void arrayListRemove(){
        for (int i = 0; i < 10000; i++){
            arraylist.remove(0);
        }
    }

    public void linckedListRemove(){
        for (int i = 0; i < 10000; i++){
            linckedlist.remove(0);
        }
    }

    public void getArrayList(){
        for (int i = 0; i < 10000; i++){
            arraylist.get(i);
        }
    }

    public void getLinckedList(){
        for (int i = 0; i < 10000; i++){
            linckedlist.get(i);
        }
    }

    public void setArraylist(){
        for (int i = 0; i < 10000; i++){
            arraylist.set(i, i*2);
        }
    }

    public void setLinckedlist(){
        for (int i = 0; i < 10000; i++){
            linckedlist.set(i, i*2);
        }
    }

    public void showList(){
        System.out.println(arraylist);
        System.out.println(linckedlist);
    }

    public void getTimeMsOfInsertArray(){
        double startTime = System.currentTimeMillis();

        arrayListCreate();

        double endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public void getTimeMsOfInsertLincked(){
        double startTime = System.currentTimeMillis();

        linckedListCreate();

        double endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public void getTimeMsOfGetArray(){
        double startTime = System.currentTimeMillis();


        getArrayList();

        double endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
    public void getTimeMsOfGetLincked(){
        double startTime = System.currentTimeMillis();

        getLinckedList();

        double endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
    public void getTimeMsOfSetArray(){
        double startTime = System.currentTimeMillis();

        setArraylist();

        double endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
    public void getTimeMsOfSetLincked(){
        double startTime = System.currentTimeMillis();

        setLinckedlist();

        double endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public void getTimeMsOfRemoveArray(){
        double startTime = System.currentTimeMillis();

        arrayListRemove();

        double endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
    public void getTimeMsOfRemoveLincked(){
        double startTime = System.currentTimeMillis();

        linckedListRemove();

        double endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
