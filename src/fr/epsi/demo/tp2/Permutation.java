package fr.epsi.demo.tp2;

import java.util.Arrays;

public class Permutation {

    public static int[] doCircularPermutation(int offset, int... myArray){
        int[] ret = new int[myArray.length];
        for(int index = 0; index<myArray.length; index++){
            ret[(index + offset)%myArray.length] = myArray[index];
        }
        return ret;
    }


    public static void main(String... args){
        System.out.println(Arrays.toString(doCircularPermutation( 2, 1,2,3,4,5)));

    }


}
