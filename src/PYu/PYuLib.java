//Phillip Yu 9/18/18
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
    public static Boolean isFibonnaci(int num)
    {
        int end = 0;
        int start = 0;
        int add = 1;
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
    public static Boolean isPalindrome(String test)
    {
        String test1 = test.toLowerCase();
        int num = test.length()-1;
        String word = "";
        for(int i = num; i >= 0;i-=1)
        {
            String Part = test1.substring(i,i+1);
            word += Part;
        }
        return (test1.equals(word));
    }
    public static int lcm(int num1, int num2,int num3)
    {
       int gcd =1;
       for(int i = 1;i < num1 || i < num2 || i < num3;i+=1)
       {
           int rem = num1 % i;
           int rem2 = num2 % i;
           int rem3 = num3 % i;
           if(rem == 0 && rem2 == 0 && rem3 == 0)
           {
               gcd = i;
           }
       }
       for()
       return gcd;
    }
}
