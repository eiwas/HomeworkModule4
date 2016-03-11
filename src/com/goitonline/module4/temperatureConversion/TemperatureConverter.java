package com.goitonline.module4.temperatureConversion;

/**
 * Created by Michael on 11.03.2016.
 */
public class TemperatureConverter {
    public double convertToFahrehheit (double tempC) {
        double conversionResultFahrenheit = tempC * 1.8 + 32;
        return conversionResultFahrenheit;
    }

    public double convertToCelsius (double tempF) {
        double conversionResultCelcius = (tempF - 32) / 1.8;
        return conversionResultCelcius;
    }
}
