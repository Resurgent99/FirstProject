package javaRush17Notebook;

public class Note {

  public void addNote(String note) {
    System.out.println("Added note: " + note);
  }

  public void removeNote(String threadName) {
    System.out.println("Removed note by " + threadName);
  }

}
