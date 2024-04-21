package ushtrimi11;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text;
        String maxLengthTxt="";
        do {
            System.out.println("Give a text...");
            text = sc.nextLine();
            if (text.isEmpty()) {
                System.out.println("No input provided!");
                break;
            }
            else if (!text.equalsIgnoreCase("Enough")
                    && text.length()>= maxLengthTxt.length() ){
                maxLengthTxt= text;
            }
        } while (!text.equalsIgnoreCase("Enough"));

        System.out.println(maxLengthTxt);
    }
}
