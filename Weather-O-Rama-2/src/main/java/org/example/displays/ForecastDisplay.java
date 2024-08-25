package org.example.displays;

import org.example.DisplayElement;
import org.example.Observer;
import org.example.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
  private WeatherData weatherData;

  private float temperature;
  private float humidity;

  private float pressure;

  public ForecastDisplay(WeatherData weatherData) {
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
    System.out.println("Forecasts: [Temperature "+ temperature + "Humidity "+ humidity + "Pressure "+ pressure+"]");
  }

  public void update() {
    //Add some forecast algorithm later
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    this.pressure = weatherData.getPressure();
    display();
  }
}
