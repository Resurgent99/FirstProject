package DateQuest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateQuestRealise {
    public static final String firstDateFormat = "yyyy-MM-dd";
    public static final String secondDateFormat = "dd.MM.yyyy";

    public static String setFirstDateFormat(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(firstDateFormat);
        return sdf.format(date);
    }

    public static String setSecondDateFormat(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(secondDateFormat);
        return sdf.format(date);
    }
}
