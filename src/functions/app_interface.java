package functions;
import java.util.Scanner;
/**
 * Created by coma on 19.07.2016.
 */
public class app_interface {

    public static int input_day() {
        int day;
        Scanner in = new Scanner(System.in);
        System.out.println("Input your day:");
        day = in.nextInt();
        return day;
    }

    public static int input_month() {
        int month;
        Scanner in = new Scanner(System.in);
        System.out.println("Input your month:");
        month = in.nextInt();
        return month;
    }

    public static int input_year(){
        int year;
        Scanner in = new Scanner(System.in);
        System.out.println("Input your year:");
        year = in.nextInt();
        return year;
    }

}
