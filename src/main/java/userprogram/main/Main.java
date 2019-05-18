package userprogram.main;

import userprogram.User;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie");
        String fname = sc.nextLine();
        System.out.println("Podaj nazwisko");
        String lname = sc.nextLine();
        System.out.println("Podaj pesel");
        String pesel = sc.nextLine();
        System.out.println("Podaj wiek");
        int age = sc.nextInt();
        System.out.println("podaj rok urodzenia");
        int year = sc.nextInt();
        System.out.println("Podaj miesiac urodzenia jako liczbe od 1 do 12");
        int month = sc.nextInt();
        System.out.println("podaj dzień urodzenia jako liczbe od 1 do 31");
        int day = sc.nextInt();
        LocalDate dateOfBirth = LocalDate.of(year, month, day);

        User user = User
                .getBuilder()
                .setFName(fname)
                .setLName(lname)
                .setPesel(pesel)
                .setLAge(age)
                .setLBirthDate(dateOfBirth)
                .build();
        System.out.println(user);

    }
}
