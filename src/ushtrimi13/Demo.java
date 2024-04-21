package ushtrimi13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        stutter("This is my test");
    }
    static void stutter(String line){
       String[] arrayOfStrings = line.split("\\s+");
       //fjalia  This is my test
        //kte kthen line.split -> String[] strings = new String[]{"This","is","my","test"};
       for (String word : arrayOfStrings){
            System.out.print(word + " " + word + " ");
       }
    }

    static String[] ourSplitter(String regex,String line){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        //provo te ndertosh nje spliter
        return new String[]{"null","null"};
    }
}
