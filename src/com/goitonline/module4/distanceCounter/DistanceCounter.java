package com.goitonline.module4.distanceCounter;

/**
 * Created by Michael on 11.03.2016.
 */
public class DistanceCounter {
       public double countDistance(double x1Coord, double x2Coord, double y1Coord, double y2Coord) {
        double distance = Math.sqrt(Math.pow(2, (x2Coord - x1Coord)) + Math.pow(2, (y2Coord - y1Coord)));
        return distance;
    }
}
