package ushtrimi20;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int generatedNumber = random.nextInt(0,101);
        System.out.println("Jep numrin qe mendon se kompiuteri" +
                " ka gjeneruar!");
        int guessNumber = scanner.nextInt();
        boolean kushti = true;
        do {
            if (guessNumber == generatedNumber){
                System.out.println("Congratulations!");
                kushti = false;
            } else if (guessNumber < generatedNumber) {
                System.out.println("Not enough!");
                System.out.println("Jep serisht numrin: ");
                guessNumber = scanner.nextInt();
            }else{
                System.out.println("To much!");
                System.out.println("Jep serisht numrin: ");
                guessNumber = scanner.nextInt();
            }
        }while (kushti);
    }
}
