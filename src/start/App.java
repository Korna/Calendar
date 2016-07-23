package start;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                JOptionPane.showMessageDialog(null, "Hmmmm thats the message.");
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
