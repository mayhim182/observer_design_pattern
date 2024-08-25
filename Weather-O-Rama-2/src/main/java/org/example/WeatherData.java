package org.example;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

  private float temperature;
  private float humidity;
  private float pressure;

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

  public List<Observer> getObserverList() {
    return observerList;
  }

  public void setObserverList(List<Observer> observerList) {
    this.observerList = observerList;
  }

  List<Observer> observerList;

  public WeatherData() {
    this.observerList = new ArrayList<Observer>();
  }


  public void registerObserver(Observer observer) {
    this.observerList.add(observer);
  }

  public void removeObserver(Observer observer) {
    this.observerList.remove(observer);
  }



  public void notifyObservers() {
    for(Observer observer:observerList) {
      observer.update();
    }
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.pressure = pressure;
    this.humidity = humidity;
    notifyObservers();
  }
}
