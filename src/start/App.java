package start;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import functions.app_interface;
import functions.app_database;
import database.names;
import core.app_calculation;

/**
 * Created by coma on 23.07.2016.
 */
public class App {
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField1;
    private JButton button1;
    private JPanel panelMain;
    private JLabel Label_day;
    private JLabel Label_month;
    private JLabel Label_year;

    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int day = -1, month = -1, year = -1;
                if (e.getSource()==button1) {
                    day = Integer.parseInt(textField1.getText());
                    month = Integer.parseInt(textField2.getText());
                    year = Integer.parseInt(textField3.getText());
                }
                String temp = functions.app_database.astro_sign(day, month);
                temp += "\n" + core.app_calculation.calc_day_of_week(day, month, year);
                temp += "\n" + core.app_calculation.calc_moon_phase(day, month, year);
                JOptionPane.showMessageDialog(null, temp);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calendar");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
