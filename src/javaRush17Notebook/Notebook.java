package javaRush17Notebook;

public class Notebook extends Thread {

  private Note note;

  public Notebook(Note note) {
    this.note = note;
  }

  @Override
  public void run() {
    for (int index = 0; index < 1000; index++) {
      String noteName = getName() + "-Note" + index;
      note.addNote(noteName);
      note.removeNote(getName());
    }
  }

}
