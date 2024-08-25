package org.example.displays;

import org.example.DisplayElement;
import org.example.Observer;
import org.example.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private WeatherData weatherData;

  private float temperature;
  private float humidity;
  private float pressure;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    //We ourselves are passing the weatherData object
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }



  public void display() {
    System.out.println("Temperature "+ temperature + "Humidity "+ humidity + "Pressure "+ pressure);
  }

  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    this.pressure = weatherData.getPressure();
    this.display();
  }
}
