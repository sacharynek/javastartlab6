package numbers;

import java.util.Scanner;

public class NumberLogicTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] liczby = new int[3];
        for(int i =1; i< 4; i++){
            System.out.println("podaj liczbe numer: "+i);
            liczby[i-1] = sc.nextInt();
        }

        System.out.println("min: "+NumberLogic.least(liczby[0], liczby[1], liczby[2]));
        System.out.println("max: "+NumberLogic.greatest(liczby[0], liczby[1], liczby[2]));
        System.out.println("avg: "+NumberLogic.average(liczby[0], liczby[1], liczby[2]));
    }

}
