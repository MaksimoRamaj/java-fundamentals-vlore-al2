package ushtrimi3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        float[] rrenjet;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos koef. a: ");
        int a = scanner.nextInt();

        System.out.println("Vendos koef. b: ");
        int b = scanner.nextInt();

        System.out.println("Vendos koef. c: ");
        int c = scanner.nextInt();

        float dallori = llogaritDallorin(a,b,c);
        if (dallori >= 0) {
            rrenjet = llogaritRrenjet(a, b, dallori);
            System.out.println("Rrenja 1: " + rrenjet[0]);
            System.out.println("Rrenja 2: " + rrenjet[1]);
        }else {
            System.out.println("Dallori negativ, nuk kemi rrenje reale!");
        }
    }

    static float llogaritDallorin(int a,int b,int c){
        return (float) (Math.pow(b,2) - 4 * a * c);
    }

    static float[] llogaritRrenjet(int a,int b,float dallori){
        //po e supozoj qe dallori eshte gjithmone >= 0
        float rrenja1 = (float) ((-b - Math.sqrt(dallori))/(2*a));
        float rrenja2 = (float) ((-b + Math.sqrt(dallori))/(2*a));

        float[] rrenjet = new float[2];
        rrenjet[0] = rrenja1;
        rrenjet[1] = rrenja2;

        return rrenjet;
    }

}
