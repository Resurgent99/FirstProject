package DateQuest;

import java.util.Date;

public class DateQuestMain {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Первый формат даты " + DateQuestRealise.setFirstDateFormat(currentDate));
        System.out.println("Первый формат даты " + DateQuestRealise.setSecondDateFormat(currentDate));
    }
}
