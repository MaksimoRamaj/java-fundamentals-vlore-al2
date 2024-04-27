package ushtrimi16;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        //"1, 3, 8, 4, 2, 5, 6, 11, 13, 7"
        int[] numrat = new int[]{1,3,8,4,2,5,6,11,13,7};
        int[] subSeq = new int[numrat.length]; //{0,0,0,0,0,0,0,0,0,0}

        //mbush subSeq me 1
        //Arrays.fill(subSeq,1); //mbush me 1-sha

        for (int i = 0 ; i < subSeq.length ; i++){
            subSeq[i] = 1;
        }


        int second = 1;
        int first = second - 1;
        int actualSubSeqIndex = 0;

        for(int i = second ; i < numrat.length ; i++){
            if (numrat[second] > numrat[first]){
                //kemi nenseq rritese
                subSeq[actualSubSeqIndex]++;
            }else {
                actualSubSeqIndex++;
            }
            first++;
            second++;
        }
        System.out.println(Arrays.toString(numrat));
        System.out.println(Arrays.toString(subSeq));

        System.out.println("Vlera max: " + findMaxValueInArray(subSeq));

    }

    static int findMaxValueInArray(int[] array){
        int max = array[0];
        for (int i = 1 ; i < array.length ; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }


}
