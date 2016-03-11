package com.goitonline.module4.squareCounter;

/**
 * Created by Michael on 12.03.2016.
 */
public class SquareCounter {
    public double triangleSquare (double sideA, double sideB, double sideC) {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        double triangleSquareResult = Math.sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));
        return triangleSquareResult;
    }
    public double rectangleSquare (double rectangleSideA, double rectangleSideB) {
        double rectangleSquareResult = rectangleSideA * rectangleSideB;
        return rectangleSquareResult;
    }
    public double circleSquare (double circleRadius) {
        double circleSquareResult = Math.PI * (Math.pow(2, circleRadius));
        return circleSquareResult;
    }
}
