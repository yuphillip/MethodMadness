package PYu;

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

}
