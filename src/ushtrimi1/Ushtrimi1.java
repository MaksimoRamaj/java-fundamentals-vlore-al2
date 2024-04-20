package ushtrimi1;

import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {

        //thirrja e metodes jo-statike
        //ka nevoje per nje objekt qe te thirret
        Ushtrimi1 obj1 = new Ushtrimi1();
        float perimetri = obj1.llogaritPerimetrin();
        System.out.println("Perimetri: " + perimetri);

        //thirrja e metodes statike
        Ushtrimi1.llogaritPerimetrin2();

    }

    public static void llogaritPerimetrin2(){return;}

    public float llogaritPerimetrin(){
        //merr input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep vleren e diametrit: ");
        float diametri = scanner.nextFloat();
        float rreze = diametri / 2;
        float perimetri = (float) (2 * Math.PI * rreze);

        return perimetri;
    }
    //krijoni metoden
    //merrni diametrin me scanner
    //llogarit perimetrin me formulen  =
}
