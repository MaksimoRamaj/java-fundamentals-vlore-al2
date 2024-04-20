package ushtrimi5;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Jep nje numer pozitiv: ");
             num = scanner.nextInt();
        }while (num < 0);

        for (int i = 2; i < num ; i++){
            if (Demo.isPrime(i)){
                System.out.print(i + " ");
            }
        }

    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(num) ; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
