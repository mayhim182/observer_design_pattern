package org.example;

import org.example.displays.CurrentConditionsDisplay;
import org.example.displays.ForecastDisplay;
import org.example.displays.StatisticsDisplay;

public class Main {
  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

    weatherData.setMeasurements(12, 3, 4);
    weatherData.setMeasurements(10, 3, 4);
  }
}
