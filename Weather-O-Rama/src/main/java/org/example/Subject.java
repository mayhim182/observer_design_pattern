package org.example;

public interface Subject {

  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  //Both of these methods take an Observer as an argument-that
  //Observer to be registered or removed.

  public void notifyObservers();
  //This method is called to notify all observers
  //when the subject's state has changed
}
