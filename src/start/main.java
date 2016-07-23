package start;
import functions.app_interface;
import functions.app_database;
import database.names;
import core.app_calculation;
import javax.swing.*;

/**
 * Created by coma on 19.07.2016.
 */

public class main {

    public static void main(String[] args) {
        String temp = "0";
        int day = 0, month = 0, year = 0;
        JOptionPane.showMessageDialog(null, "------------------------<Astro calendar>----------------------------\nYou can get a wide list of information for the date you write.");
        temp = JOptionPane.showInputDialog("Введите день");
        day = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog("Введите месяц");
        month = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog("Введите год");
        year = Integer.parseInt(temp);
        JOptionPane.showMessageDialog(null, functions.app_database.astro_sign(day, month));
        JOptionPane.showMessageDialog(null, core.app_calculation.calc_day_of_week(day, month, year));
        JOptionPane.showMessageDialog(null, core.app_calculation.calc_moon_phase(day, month, year));
    }



}