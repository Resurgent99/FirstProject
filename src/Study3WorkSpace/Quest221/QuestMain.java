package Study3WorkSpace.Quest221;

public class QuestMain {

  public static void main(String[] args) {
       QuestWorkspace stroka = new QuestWorkspace();
   try {
     System.out.println(stroka.catchMethod());
   } catch (Exception e) {
     throw new RuntimeException(e);
    }


  }
}
