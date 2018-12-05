package com.CyberDimon.Chapter8;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
//        -Write a method called reverse() with an int array as a parameter.
//
//                -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//
//                -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//                -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//
//
//        Tip:
//        -Create a new console project with the name eReverseArrayChallengef

        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));

    }

    // change array by reference
    private static void reverse(int[] array) {

        int sizeOfArray = array.length;
        int maxIndex = sizeOfArray - 1;
        int halfLength = sizeOfArray / 2;
        int temp;

        for (int i=0; i<halfLength; i++) {
            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

}
