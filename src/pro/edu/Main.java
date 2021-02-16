package pro.edu;

import jdk.internal.dynalink.linker.LinkerServices;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{10,20,30,40,50};
        for (int i = 0; i < array.length ; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int buffer = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (i != array.length - 1 ) {
                array[i] = array[i + 1];

            }else{
                array[i] = buffer;
            }
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
            buffer = array[array.length-1];
         for (int i = array.length-1; i >=0 ; i--) {
                    if (i != 0 ) {
                        array[i] = array[i - 1];

                    }else{
                        array[i] = buffer;
                    }
                }
                for (int i = 0; i < array.length ; i++) {
                    System.out.print(" " + array[i]);
                }


    }
}
