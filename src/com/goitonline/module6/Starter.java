package com.goitonline.module6;

import com.goitonline.module5.SortingLogic;

import java.util.Scanner;

/**
 * Created by Michael on 18.03.2016.
 */
public class Starter {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("This is a programme for working with arrays");
        System.out.println("First select the required operation.");
        int modeSelect = Starter.modeSelector("Press 1 to display the minimum and maximum numbers in the array or 2 to sort the array");
        while (true) {
            switch (modeSelect) {
                case 1:
                    x = Starter.screenReader("Enter the number of elements in array");
                    int[] myArray = new int[x];
                    for (int i = 0; i < x -1; i++) {
                        myArray[i] = (int) (10 * Math.random());
                    }
                    SortingLogic myMinMax = new SortingLogic();
                    int minimumValue = myMinMax.getMinValue(myArray);
                    int maximumValue = myMinMax.getMaxValue(myArray);
                    System.out.println("The minimum value of the array is " + minimumValue + " and the maximum value of array is " + maximumValue + ".");
                    break;
                case 2:
                    x = Starter.screenReader("Enter the number of elements in array");
                    int[] myArray2 = new int[x];
                    for (int i = 0; i < x -1; i++) {
                        myArray2[i] = (int) (10 * Math.random());
                    }
                    SortingLogic mySorting = new SortingLogic();
                    int[] sortingResult = mySorting.arraySorter(myArray2);
                    System.out.println("The sorted array now looks as follows");
                    for (int element : myArray2){
                        System.out.println(element);
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }
    public static int modeSelector (String message1) {
        while (true){
            try {
                System.out.println(message1);
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (Exception E) {
                System.out.println("Bad input. Please try again!");
            }
        }
    }
    public static int screenReader(String message){
        while (true){
            try {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (Exception E) {
                System.out.println("Bad input. Please try again!");
            }
        }
    }
}
