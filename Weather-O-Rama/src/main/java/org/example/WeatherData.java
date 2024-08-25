package org.example;

import java.util.ArrayList;
import java.util.List;

//REMEMBER: We don't provide import and package
//statements in the code listing.


//Weather data now implements the subject interface
public class WeatherData implements Subject {

  private List<Observer> observers; //We have added an ArrayList to hold the observers, and
                                    //we create it in the constructor
  private float temperature;
  private float humidity;
  private float pressure;


  public WeatherData() {
    observers = new ArrayList<Observer>();
  }

  public void registerObserver(Observer observer) {
    observers.add(observer); // When an observer registers we add it to the end of
    // the list
  }

  public void removeObserver(Observer o) {
    observers.remove(observers);
  }


  public List<Observer> getObservers() {
    return observers;
  }

  public void setObservers(List<Observer> observers) {
    this.observers = observers;
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

  //Here's the fun part; this is where we tell all the observers about the state
  //Because they are all Observers, we know they all implement update(), so we know
  //how to notify them
  public void notifyObservers() {
    for( Observer observer:observers) {
      //calling update on that observer
      observer.update();
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

}
