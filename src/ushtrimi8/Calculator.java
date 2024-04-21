package ushtrimi8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        /*
        Write an application that implements a simple calculator.
            The application should:
a. read first number (type float)
b. read one of following symbols: + - / *
c. read second number (type float)
d. return a result of given mathematical operation
If the user provides a symbol other than supported, the application should print "Invalid
symbol". If the entered action cannot be implemented (i.e. it is inconsistent with the
principles of mathematics), the application should print "Cannot calculate".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep numrin e pare: ");
        float nr1 = scanner.nextFloat();
        System.out.println("Zgjidh veprimin:");
        String veprimi = scanner.next();
        System.out.println("Jep numrin e dyte: ");
        float nr2 = scanner.nextFloat();
        float rez = Float.NaN;


        switch (veprimi) {
            case "+":
                rez = nr1 + nr2;
                break;
            case "-":
                rez = nr1 - nr2;
                break;
            case "*":
                rez = nr2 * nr1;
                break;
            case "/":
                if (nr2 == 0) System.out.println("Veprimi nuk mund te kryhet");


                else rez = nr1 / nr2;
                break;
            default:
                System.out.println("Keni vendosur operator te gabuar!");
        }
        System.out.println("Rezultati: " + rez);
    }


}
