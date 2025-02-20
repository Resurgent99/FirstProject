package Study3WorkSpace.Quest221;

import Study3WorkSpace.TooShortStringException.TooShortStringException;

public class QuestWorkspace {

  public String catchMethod() throws Exception, TooShortStringException {
    try {
      System.out.println("Before start ");
      getPartOfString("JavaRush - лучший сервис обучения Java.");
      System.out.println("After end");
    } catch (Exception e) {
      throw e;
    }
    return getPartOfString("JavaRush - лучший сервис обучения Java.");
  }

 public String getPartOfString(String string) {
   int startIndex = string.indexOf(" ", string.indexOf(" ") + 0 );
   int endIndex = string.indexOf(" ",
       string.indexOf(" ", string.indexOf(" ", string.indexOf(" ", string.indexOf(" ")+1) +1) +1) +1) +1;
   if (endIndex == -1) {
     endIndex = string.length();
   }
   return string.substring(startIndex, endIndex);
 }
}
