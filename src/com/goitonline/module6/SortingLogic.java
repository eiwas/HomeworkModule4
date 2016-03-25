package com.goitonline.module6;

import java.util.Arrays;

public class SortingLogic {
    public int[] arraySorter(int[] myArray2) {
        boolean changeHappened = true;
        while (changeHappened) {
            changeHappened = false;
            for (int i = 0; i < myArray2.length - 1; i++) {
                if (myArray2[i] > myArray2[i + 1]) {
                    int tempVar = myArray2[i];
                    myArray2[i] = myArray2[i + 1];
                    myArray2[i + 1] = tempVar;
                    changeHappened = true;
                }
            }
        }
        return myArray2;

    }
    public int getMinValue (int[] myArray) {
        int min = 0;
        Arrays.sort(myArray);
        min = myArray[0];
        return min;
    }
    public int getMaxValue (int[] myArray) {
        int max = 0;
        Arrays.sort(myArray);
        max = myArray[myArray.length-1];
        return max;
    }
}
