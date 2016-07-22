package start;
import functions.app_interface;
import functions.app_database;
import database.names;
import core.app_calculation;
/**
 * Created by coma on 19.07.2016.
 */

public class main {

    public static void main(String[] args) {
        int day, month, year;
        String sign, week, moon;
        System.out.println("\t\t\t\t--<Astro calendar>--\nYou can get a wide list of information for the date you write.");
        day = app_interface.input_day();
        month = app_interface.input_month();
        year = app_interface.input_year();
        sign = functions.app_database.astro_sign(day, month);
        System.out.printf("%s", sign);
        week = core.app_calculation.calc_day_of_week(day, month, year);
        System.out.printf("%s", week);
        moon = core.app_calculation.calc_moon_phase(day, month, year);
        System.out.printf("%s", moon);
    }


}