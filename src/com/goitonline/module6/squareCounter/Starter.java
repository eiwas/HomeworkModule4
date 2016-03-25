package com.goitonline.module6.squareCounter;

import java.util.Scanner;

/**
 * Created by Michael on 12.03.2016.
 */
public class Starter {
    public static void main(String[] args) {
        System.out.println("Here is the program to calculate the areas of various shapes.");
        System.out.println("First select the shape the area of which you need to calculate.");
        int modeSelect = Starter.modeSelector("Press 1 to calculate the triangle area, 2 to calculate the rectangle area, 3 to calculate the circle area.");
        switch (modeSelect) {
            case 1:
                double sideA = Starter.screenReader("Enter the side A of triangle");
                double sideB = Starter.screenReader("Enter the side B of triangle");
                double sideC = Starter.screenReader("Enter the side C of triangle");
                SquareCounter triangleArea = new SquareCounter();
                double resultTriangleArea = triangleArea.triangleSquare(sideA, sideB, sideC);
                System.out.println("The triangle area is " + resultTriangleArea + ".");
                break;
            case 2:
                double rectangleSideA = Starter.screenReader("Enter the side A of the rectangle");
                double rectangleSideB = Starter.screenReader("Enter the side B of the rectangle");
                SquareCounter rectangleArea = new SquareCounter();
                double resultRectangleArea = rectangleArea.rectangleSquare(rectangleSideA, rectangleSideB);
                System.out.println("The rectangle area is " + resultRectangleArea + ".");
                break;
            case 3:
                double circleRadius = Starter.screenReader("Enter the radius of the circle");
                SquareCounter circleArea = new SquareCounter();
                double resultCircleArea = circleArea.circleSquare(circleRadius);
                System.out.println("The circle area is " + resultCircleArea + ".");
                break;
            default:
                System.out.println("Invalid value");
                return;
        }
    }

    public static int modeSelector (String message) {
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
