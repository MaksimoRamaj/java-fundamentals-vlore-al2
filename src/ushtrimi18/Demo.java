package ushtrimi18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep fjalen: ");
        String userInput = scanner.next();

        Pattern pattern = Pattern.compile("[0-9][A-Z]acho+!");
        Matcher matcher = pattern.matcher(userInput);

        if (matcher.matches()){
            System.out.println("Shendet!");
        }else {
            System.out.println("No match found!");
        }
    }
}
