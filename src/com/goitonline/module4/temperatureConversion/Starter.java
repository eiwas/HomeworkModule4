package com.goitonline.module4.temperatureConversion;

import java.util.Scanner;

/**
 * Created by Michael on 11.03.2016.
 */
public class Starter {
    public static void main(String[] args) {
        System.out.println("Here is the program to convert between Celsius and Fahrenheit.");
        System.out.println("First select the direction of conversion.");
        System.out.println("");
        int modeSelect = Starter.modeSelector("Press 1 to convert from Celsius to Fahrenheit or 2 to convert from Fahrenheit to Celcius");
        switch (modeSelect) {
            case 1:
                double tempC = Starter.screenReader("Enter the temperature value in Celcius");
                TemperatureConverter myConversionF = new TemperatureConverter();
                double conversionResultF = myConversionF.convertToFahrehheit(tempC);
                System.out.println("The conversion result is " + conversionResultF + " degrees Fahrenheit");
                break;
            case 2:
                double tempF = Starter.screenReader("Enter the temperature value in Fahrenheit");
                TemperatureConverter myConversionC = new TemperatureConverter();
                double conversionResultC = myConversionC.convertToCelsius(tempF);
                System.out.println("The conversion result is " + conversionResultC + " degrees Celsius");
                break;
            default:
                System.out.println("Invalid value");
                break;
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
