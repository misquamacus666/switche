package com.company;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        System.out.println("Podaj Liczbę w zakresie 0-29");
        Scanner scanner = new Scanner(System.in);
        int FirstNumber = scanner.nextInt();

        switch (FirstNumber){
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 13:
            case 17:
            case 19:
            case 23:
            case 29:
                System.out.println("Ta liczba jest liczbą pierwszą hehe");
                break;
            default:
                System.out.println("To nie jest liczba pierwsza xd");


        }


    }
}
