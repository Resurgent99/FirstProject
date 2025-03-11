
package javaRush17Notebook;

//1. Класс Note будет использоваться нитями.
//2. Создай public static нить NoteThread (Runnable не является нитью), которая в методе run 1000 раз (index = 0-999) сделает следующие действия:
//2.1. используя метод addNote добавит заметку с именем [getName() + "-Note" + index], например, при index=4
//"Thread-0-Note4"
//2.2. используя метод removeNote удалит заметку
//2.3. в качестве первого параметра в removeNote передай имя нити - метод getName()
public class Main {

  public static void main(String[] args) {
    Note note = new Note();
    Notebook noteThread = new Notebook(note);
    noteThread.start();
  }

}
