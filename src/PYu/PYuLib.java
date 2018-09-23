//Phillip Yu 9/18/18
package PYu;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class PYuLib {

    public static String cutOut(String mainStr, String subStr)
    {
        String mainStr1 = mainStr.toLowerCase();
        int first = mainStr1.indexOf(subStr);
        int str2 = subStr.length()-1;
        String First = mainStr1.substring(0,first);
        String New = mainStr1.substring((first + str2 + 1),mainStr1.length());
        String Final = First + New;
        return Final;
        /*I first made a substring in order to separate the front of the word to the phrase you are trying to take out.
        Then I made another substring finding the end of the string to the end of the word. Then I combine the two
        strings I made and return that word. The only test case I accounted for is if the phrase you are trying
        to separate is not in the beginning of the word.
         */
    }
    public static String dateStr(String date)
    {
        String day = date.substring(3,5);
        String month = date.substring(0,2);
        String year = date.substring(6,date.length());
        String newDate = day + "-" + month + "-" + year;
        return newDate;
        /*First I made a substring for day, month, and year of the date in a separate Strings. Then I made a new string
        combining all of them putting dashes in between and returned that string.
         */
    }
    public static Integer sumUpTo(Integer num)
    {
        Integer sum = 0;
        for(int i = num; i >= 0; i-=1)
        {
            sum += i;
        }
        return sum;
        /*I started by making a new variable called sum to add up all the numbers. Then I made a for loop which goes on
        for as long as i is greater than 0 and will keep adding numbers to sum until the loop stops. Last it returns sum.
         */
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
        /*I first made 3 variables one standing latest fibonnaci number, second being the first number you're adding,
        and the third being the second number you're adding. Then I made a while loop which goes on while the latest
        fibonnaci number is less then the number we are checking. The while loop will keeping finding the next
        fibonnaci number until it is greater than or equal to the number we're checking. After we would check if end
        is equal to the number we are checking, if yes return true else return false.
         */
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
        /*First I change the word given all into lowercase letters. Then I checked the length of the word given and
        made a new variable keeping a stringer which word track the new reversed word. The for loop will continue
        looping until i which is the amount of letters the word has is less then 0. The loop will keep finding the next
        last letter and put it into the new string. After the for loop is done it will return whether the word given is
        the same as the newly reversed version of the word.
         */
    }
}
