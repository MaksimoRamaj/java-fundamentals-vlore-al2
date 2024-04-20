package ushtrimi6;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vlera;
        do {
            System.out.println("Jep vleren: ");
            vlera = scanner.nextInt();
        }while (vlera <=0);

        double shuma = Demo.harmonicSeries(vlera);
        System.out.println(shuma);
    }

   static double harmonicSeries(int num){
        double shuma = 0.0;
        for (int i = 1; i <= num ; i++){
            shuma = shuma + 1/(double)i;
        }
        return shuma;
    }
}
