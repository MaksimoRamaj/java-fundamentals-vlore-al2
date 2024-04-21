package ushtrimi12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos fjaline: ");
        String word = scanner.nextLine();

//        float percentage = Demo.countPercentageMeth1(word);
//        float percentage = Demo.countPercentageMeth2(word);
        float percentage = Demo.countPercentageMeth3(word);
        System.out.println(percentage);
    }
    /*
    Write an application that reads a text from the user
    (type String) and counts a percentage
    of occurrences of a space character.
     */
    static float countPercentageMeth3(String text){
        Pattern pattern = Pattern.compile("\\s");

//        Matcher matcher = pattern.matcher(
//                String.valueOf(text.charAt(0)));
//        matcher.matches();

        float count = 0;
        for (int i = 0 ; i < text.length() ; i++){
            if (pattern.matcher(
                    String.valueOf(text.charAt(i))
            ).matches()){
                count++;
            };
        }
        return (count/(float)text.length())*100.0f;
    }

    static float countPercentageMeth2(String text){
        float count = 0;
        for (int i = 0 ; i < text.length() ; i++){
            if (Character.isWhitespace(text.charAt(i))){
                count++;
            };
        }
        return (count/(float)text.length())*100.0f;
    }
    static float countPercentageMeth1(String text){
        float count = 0;
        for (int i = 0 ; i < text.length() ; i++){
            if (String.valueOf(text.charAt(i))
                    .equalsIgnoreCase(" ")){
                count++;
            };
        }
        return (count/(float)text.length())*100.0f;
    }
}
