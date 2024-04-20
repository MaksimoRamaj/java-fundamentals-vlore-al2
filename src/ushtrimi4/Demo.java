package ushtrimi4;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep nje numer:");
        int num = scanner.nextInt();
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println("Fizz Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 7 == 0) {
                    System.out.println("Buzz");
                } else System.out.println(i);
            }
        } else {
            System.out.println("Numri duhet me i madh se 0!");
        }
    }
}
