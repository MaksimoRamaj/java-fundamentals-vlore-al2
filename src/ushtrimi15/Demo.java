package ushtrimi15;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        int[] numrat = new int[10];
        int[] freq = new int[10];
        int indexiRradhes = 0;
        int celsi = 0;
        //merr input nga useri 10 here
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Jep numrin: ");
            int numri = input.nextInt();
            celsi = contains(numri,numrat);
            if (celsi != (-1)){
                //do te thote qe ndodhet
                freq[celsi]++;
            }else {
                numrat[indexiRradhes] = numri;
                freq[indexiRradhes] = 1;
                indexiRradhes++;
            }
        }

        System.out.println(Arrays.toString(numrat));
        System.out.println(Arrays.toString(freq));

        printoNumratMeFreqMeTeMadheSeNje(numrat,freq);

    }

    private static void printoNumratMeFreqMeTeMadheSeNje(
            int[] numrat,int[] freq){
        for (int i = 0; i < freq.length ; i++){
            if (freq[i] > 1){
                System.out.println(
                        "Numri: " + numrat[i] + " Freq: " + freq[i]);
            }
        }
    }

    private static int contains(int numri, int[] numrat) {
        for (int i = 0; i < numrat.length ; i++){
            if (numrat[i] == numri){
                return i;
            }
        }
        //pasi ke iteruar gjithe vektorin dhe nuk e ke gjetur
        //rikthe nje index negativ
        return -1;
    }


}
