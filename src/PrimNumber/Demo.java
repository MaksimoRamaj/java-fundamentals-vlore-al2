package PrimNumber;

import javax.swing.*;

public class Demo {
    //22
    //i = 2,3,4,5,6,7,...16...22

    static int[] primeNumbers(int numri){
        int[] primeNumbersArray = new int[numri];
        int primeNumbersArrayIndex = 0;
        for (int i = 2; i <= numri ; i++){
            if (isPrime(i)){
                primeNumbersArray[primeNumbersArrayIndex] = i;
            }
        }
        return primeNumbersArray;
    }
    static boolean isPrime(int numri){
        if (numri <= 1){
            return false;
        }
        for (int i = 2 ; i < numri ; i++){
            if ((numri % i) == 0){
                return false;
            }
        }
        return true;
    }
}
