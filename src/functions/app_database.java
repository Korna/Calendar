package functions;
import database.names;
/**
 * Created by coma on 19.07.2016.
 */
public class app_database {// от нуля до 365 вкл. от нуля до 11 вкл


    public static String astro_sign(int day, int month) {//знак минус у цифры означает, что переходит на следующий месяц по ходу года в промежутке
        month--;
        int end[] =   {19, 18, 20, 19, 20, 20, 22, 22, 22, 22, 21, 21};//начинается с января
        if (day >= end[month]){
            month++;
        }
        if (month == 12)
            month = 1;

        return database.names.astro_signs(month);
    }

    public static int count_month(int a, boolean b) {// b - индикатор высокосного года //находит месяц и день в месяце, когда известен лишь сумма дней
        int i = 0;
        int amount[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};// с января
        if (b == true)
            amount[1]++;
        for (i=0; a >= amount[i]; i++){
            a -= amount[i];
        }
        return a;//день в месяце
    }

    public static int amount_month(int a, boolean b){
        a--;
        int i = 0, c = 0;
        int amount[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};// с января
        if (b == true)
            amount[1]++;
        for (i = 0; i < a; i++){
            c += amount[i];
        }
        return c;
    }

    public static int day_moon_form(double a){
        int i = 0, b = 0;
       // double p1 = 29.5305882;// % p1
        double p2 = 14.7652941;// half - means full moon
        double p3 = 7.38264705;//quarter. its Waxing: crescent, gibbous; Waning: gibbous, crescent
        double p4 = 3.691323525;
//ispravit eto nubstvo.
        if (a >= p2 - p3 - p4)
            b = 1;
        if (a >= p2 - p3)
            b = 2;
        if (a >= p2 - p4)
            b = 3;
        if (a >= p2)
            b = 4;
        if (a >= p2 + p4)
            b = 5;
        if (a >= p2 + p3)
            b = 6;
        if (a >= p2 + p3 + p4)
            b = 7;
        return b;// 0 - 7
    }



}
