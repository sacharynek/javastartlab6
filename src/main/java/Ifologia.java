public class Ifologia {


    public static void main(String[] args) {
        int number = 9;
        int check = number %2;
        switch(check) {
            case 0:
                System.out.printf("Liczba%d jest parzysta", number);
                break;
            case 1:
                System.out.printf("Liczba%d jest nieparzysta", number);
                break;
            case -1:
                System.out.printf("Liczba%d jest ujemnainieparzysta", number);
                break;
            }
        }
    }