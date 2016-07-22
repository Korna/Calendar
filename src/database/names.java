package database;

/**
 * Created by coma on 20.07.2016.
 */
public class names {

    private String names[] = {"none1", "none2", "none3", "none4", "none5", "none6", "none7", "none8", "none9", "none10", "none11", "none12"};

    public static String astro_signs(int a){
        String names[] = {"The Mountain Sea-goat", "The Water-bearer", "The Fish", "The Ram", "The Bull", "The Twins", "The Crab", "The Lion", "The Maiden", "The Scales", "The Scorpion", "The Archer"};//начиная с января
        return names[a];
    }

    public static String months(int a) {
        a--;
        String names[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "November", "December"};
        return names[a];
    }

    public static String year_signs(int a){
        a--;
        String names[] = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
        return names[a];
    }

    public static String day_of_week(int a){
        a--;
        String names[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return names[a];
    }

    public static String moon_phase(int a){
        a--;
        String names[] = {"New moon", "Waxing crescent", "First quarter", "Waxing gibbous", "Full moon", "Waning gibbous", "Third quarter", "Waning crescent"};
        return names[a];
    }

}
