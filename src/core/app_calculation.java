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
        int a = 0, b = 0;
        int i;
        b = (year / 4);
        System.out.printf("\nDigit of all leap years is:%d\n", b);
        b +=  year  * 365;
        b += app_database.amount_month(month, false);
        b += day;
        System.out.printf("\nAmount of days:%d\n", b);
        a = (4 + b) % 7;
        return database.names.day_of_week(++a);
    }

    public static String calc_moon_phase (int day, int month, int year){
        double b = 0, a = 0;
        double p1 = 29.5305882;// % p1

        b = (year / 4);
        b +=  year  * 365;
        b += app_database.amount_month(month, false);
        b += day;
        a = (25.5305882 + b - 1.8456617625) % p1;
        System.out.printf("\nMoon day:%g\n", a);
        return database.names.moon_phase(functions.app_database.day_moon_form(a));
        
    }


}
