package ushtrimi17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.of(2024, Month.MAY,14);
//        System.out.println(localDate);
//        System.out.println(localDate.getDayOfWeek());
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//
//        Period p =Period.between(localDate,localDateTime.toLocalDate());
//            System.out.println(Math.abs(p.getDays()));

        //marrim daten nga perdoruesi
        Scanner input = new Scanner(System.in);
        System.out.println("Jep daten: (YYYY-MM-DD)");
        String nextDate = input.next("^\\d{4}-\\d{2}-\\d{2}$");

        String[] words = nextDate.split("-");
        Integer[] date = new Integer[3];

        for (int i = 0; i < date.length ; i++){
            date[i] = Integer.parseInt(words[i]);
        }

        LocalDate nextSdaCourseDate = LocalDate.of(date[0],date[1],date[2]);

        Period p = Period.between(LocalDate.now(),nextSdaCourseDate);

        System.out.println("Next: " + p.getDays());
    }
}