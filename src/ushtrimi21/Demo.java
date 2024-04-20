package ushtrimi21;

import java.util.Scanner;

public class Demo {
    //gjej prodhimin e numrave deri ne n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jep nje numer:");
        int fact= sc.nextInt();
        int multiplication= 1;
        for (int i = 1; i <= fact; i++) {
            multiplication *= i;
        }

        System.out.println("Factorial of "+ fact+ " = "+ multiplication);
    }
}
