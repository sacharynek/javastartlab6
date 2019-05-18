public class DayOfWeek {

    public static String getDayOfWeek(int a) {

        switch (a) {
            case 1:
                return "Poniedziałek ";
            case 2:
                return "Wtorek ";
            case 3:
                return "Sroda ";
            case 4:
                return "Czwartek ";
            case 5:
                return "Piątek ";
            case 6:
                return "Sobota ";
            case 7:
                return "Niedziela ";
            default:
                return "Podales zla liczbe";
        }
    }

    public static String isPracujacy(int a) {
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return "pracujacy";
            case 6:
            case 7:
                return "wolny";
            default:
                return "nie wiem";
        }
    }

    public static void checkDay(int a){
        System.out.println("Podany numer dnai tygodnia: "+a);
        System.out.println(getDayOfWeek(a) + " to: "+isPracujacy(a));
    }

}
