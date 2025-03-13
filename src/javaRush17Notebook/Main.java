
package javaRush17Notebook;

//1. Класс Note будет использоваться нитями.
//2. Создай public static нить NoteThread (Runnable не является нитью), которая в методе run 1000 раз (index = 0-999) сделает следующие действия:
//2.1. используя метод addNote добавит заметку с именем [getName() + "-Note" + index], например, при index=4
//"Thread-0-Note4"
//2.2. используя метод removeNote удалит заметку
//2.3. в качестве первого параметра в removeNote передай имя нити - метод getName()
//1. Класс Note будет использоваться нитями. Поэтому сделай так, чтобы обращения к листу notes блокировали мютекс notes, не this
//2. Все System.out.println не должны быть заблокированы (синхронизированы), т.е. не должны находиться в блоке synchronized
//Класс Note будет использоваться нитями.
//Поэтому сделай так, чтобы лист notes находился в общей памяти
public class Main {

  public static void main(String[] args) {
    Note note = new Note();

    Notebook noteThread1 = new Notebook(note);
    Notebook noteThread2 = new Notebook(note);

    noteThread1.start();
    noteThread2.start();
  }

}
