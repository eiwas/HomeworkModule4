package com.goitonline.module6.distanceCounter;

import java.util.Scanner;

/**
 * Created by Michael on 11.03.2016.
 */
public class Starter {
    public static void main(String[] args) {
        System.out.println("Here is the program to calculate the distance between two points");
        double x1Coord = Starter.screenReader("Please enter coordinate X of point 1:");
        double y1Coord = Starter.screenReader("Please enter coordinate Y of point 1:");
        double x2Coord = Starter.screenReader("Please enter coordinate X of point 2:");
        double y2Coord = Starter.screenReader("Please enter coordinate Y of point 2:");
        DistanceCounter myCounter = new DistanceCounter();
        double distance = myCounter.countDistance(x1Coord, x2Coord, y1Coord,y2Coord);
        System.out.println("The distance between these 2 points is:" + distance);

    }
    public static double screenReader(String message){
        while (true){
            try {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                return scanner.nextDouble();
            } catch (Exception E) {
                System.out.println("Bad input. Please try again!");
            }
        }
    }
}
