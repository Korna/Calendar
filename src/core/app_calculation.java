package core;
import database.names;
import functions.app_database;

/**
 * Created by coma on 19.07.2016.
 */
public class app_calculation {

    public static boolean calc_leapyear(int year){
        boolean a = false;
        if (year % 4 == 0)
            a = true;
        return a;
    }

    public static String calc_day_of_week(int day, int month, int year){
        //2000 1 january was saturday
        //730502 - monday --- eto 3 january
        int a = 0, b = 0;// b- proschitannoe iz year month day chislo dney
        int i;
        b = (year / 4);
        System.out.printf("\nDigit of all leap years is:%d\n", b);
        b +=  year  * 365;
        b += app_database.amount_month(month, false);
        b += day;
        System.out.printf("\nAmount of days:%d\n", b);
        //ewe nujno mesiac schitat
        //a = 730502 % 7 - 3;
        a = (730503 + b) % 7;


        return database.names.day_of_week(++a);
    }

}
