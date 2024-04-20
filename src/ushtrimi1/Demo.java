package ushtrimi1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        Demo obj1 = new Demo();
//        int shuma = obj1.sum();
//        System.out.println("Shuma: " + shuma);

        int shuma = sum();
        System.out.println("Shuma: " + shuma);
    }

    public static int sum(){
        int sum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep vleren e a: ");
        int a = scanner.nextInt();

        System.out.println("Jep vleren e b: ");
        int b = scanner.nextInt();

        sum = a+b;

        return sum;
    }
}
