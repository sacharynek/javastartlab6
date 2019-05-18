package numbers;

public class NumberLogic {

    public static int greatest(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static int least(int a, int b, int c){
        if (a > b) {
            if (b > c) {
                return c;
            } else {
                return b;
            }
        } else {
            if (a > c) {
                return c;
            } else {
                return a;
            }
        }
    }

    public static double average(int a, int b, int c){
        return (a+b+c)/3.0;
    }

}
