package org.example.displays;

import org.example.DisplayElement;
import org.example.Observer;
import org.example.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

  private WeatherData weatherData;

  private float temperature;
  private float humidity;
  private float pressure;

  private float totalTemperature = 0;

  private float minTemperature = Integer.MAX_VALUE;
  private float maxTemperature = -273.15f; // in degree celsius

  private float averageTemperature = 0;

  int numberOfReadings = 0;

  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }



  public WeatherData getWeatherData() {
    return weatherData;
  }

  public void setWeatherData(WeatherData weatherData) {
    this.weatherData = weatherData;
  }

  public float getTemperature() {
    return temperature;
  }

  public void setTemperature(float temperature) {
    this.temperature = temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public void setHumidity(float humidity) {
    this.humidity = humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void setPressure(float pressure) {
    this.pressure = pressure;
  }

  public void display() {
    System.out.println("Statistics: [Temperature "+ averageTemperature + "Humidity "+ humidity + "Pressure "+ pressure+"]");
  }

  public void update() {
    this.numberOfReadings++;
    this.maxTemperature = Math.max(weatherData.getTemperature(), this.maxTemperature);
    this.minTemperature = Math.min(weatherData.getTemperature(), this.temperature);
    totalTemperature += weatherData.getTemperature();
    averageTemperature = (totalTemperature)/numberOfReadings;

    this.humidity = weatherData.getHumidity();
    this.temperature = weatherData.getTemperature();
    this.pressure = weatherData.getPressure();
    display();
  }
}
