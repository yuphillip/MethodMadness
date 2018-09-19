package PYu;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class PYuLib {

    public static String cutOut(String mainStr, String subStr)
    {
        int first = mainStr.indexOf(subStr);
        int str2 = subStr.length()-1;
        String First = mainStr.substring(0,first);
        String New = mainStr.substring((first + str2 + 1),mainStr.length());
        String Final = First + New;
        return Final;
    }
    public static String dateStr(String date)
    {
        String day = date.substring(3,5);
        String month = date.substring(0,2);
        String year = date.substring(6,date.length());
        String newDate = day + "-" + month + "-" + year;
        return newDate;
    }
    public static Integer sumUpTo(Integer num)
    {
        Integer sum = 0;
        for(Integer stat = num; stat >= 0; stat-=1)
        {
            sum += stat;
        }
        return sum;
    }
    public static Boolean isFibonnaci(Integer num)
    {
        Integer end = 0;
        Integer start = 0;
        Integer add = 1;
        while(end < num)
        {
            end = start + add;
            start = add;
            add = end;
        }
        if (end == num) {
            return TRUE;
        }
        return FALSE;
    }
    

}
