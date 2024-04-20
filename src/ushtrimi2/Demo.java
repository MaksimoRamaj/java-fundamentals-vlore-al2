package ushtrimi2;

import ushtrimi1.Ushtrimi1;

import java.util.Scanner;

public class Demo {

    //merr 2 inpute nga useri me Scanner
    //1 per peshen (float) , 1 per gjatesine (int)
    //llogarit BMI = peshe / gjatesi
    //kontrollo nese bmi > 18.5 && bmi < 24.9
    //nese kushti plotesohet printo ne console "BMI optimale"
    //ne te kundert printo "BMI jo optimale"

    public static void main(String[] args) {

        Demo.llogaritBMI();
        Demo.llogaritBMI();
        Demo.llogaritBMI();
    }

    static void llogaritBMI(){
        Scanner input = new Scanner(System.in);

        System.out.println("Jep peshen: ");
        float pesha = input.nextFloat();

        System.out.println("Jep gjatesine: ");
        int gjatesia = input.nextInt();
        float gjatesiaMeter = (float) gjatesia /100;
        float BMI = (float) (pesha / Math.pow(gjatesiaMeter , 2));
        System.out.println(BMI);
        if (BMI >= 18.5 && BMI <= 24.9){
            System.out.println("BMI optimale!");
        }else {
            System.out.println("BMI jo-optimale!");
        }
    }
}
