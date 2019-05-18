import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DayOfWeek.checkDay(0);
        DayOfWeek.checkDay(1);
        DayOfWeek.checkDay(2);
        DayOfWeek.checkDay(3);
        DayOfWeek.checkDay(4);
        DayOfWeek.checkDay(5);
        DayOfWeek.checkDay(6);
        DayOfWeek.checkDay(7);
        DayOfWeek.checkDay(8);

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.GERMAN);
    }
}
