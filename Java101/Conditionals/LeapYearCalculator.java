package Java101.Conditionals;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Lütfen yılı giriniz: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " bir artık yıldır.");

//            if (year % 400 == 0) {
//                System.out.println(year + " bir artık yıldır.");
//            } else {
//                System.out.println(year + " bir artık yıl değildir.");
//            }
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }

    }
}
