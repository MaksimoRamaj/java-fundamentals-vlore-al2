package ushtrimi14;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep karakterin e pare: ");
        //marrim nje word ose nje fjale dhe nga kjo marr karakterin e pare
        char firstChar = scanner.next().charAt(0);
        System.out.println("Jep karakterin e dyte: ");
        char secondChar = scanner.next().charAt(0);

        int diff = Math.abs(firstChar-secondChar);
        if (diff <= 1){
            System.out.println("Nuk ka karaktere ndermjet");
        }else{
            System.out.println("Numri i karaktereve ndermjet: " + (diff - 1));
        }
    }
}
