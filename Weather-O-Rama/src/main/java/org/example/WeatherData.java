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



  //Here's the fun part; this is where we tell all the observers about the state
  //Because they are all Observers, we know they all implement update(), so we know
  //how to notify them
  public void notifyObservers() {
    for( Observer observer:observers) {
      //calling update on that observer
      observer.update(temperature, humidity, pressure);
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
