
package javaRush17Notebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Note {

  private static List<String> notes = Collections.synchronizedList(new ArrayList<>());

  private static final Object lock = new Object();

  public void addNote(String note) {
    synchronized (lock) {
      notes.add(note);
    }
    System.out.println("Added note: " + note);
  }

  public void removeNote(String threadName) {
    synchronized (lock) {
      if (!notes.isEmpty()) {
        String removedNote = notes.remove(0);
        System.out.println("Removed note by " + threadName + ": " + removedNote);
      }
    }
    System.out.println("Removed note by " + threadName);
  }

}
