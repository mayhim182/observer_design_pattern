Let's unpack the source code attachments

```
WeatherData class has the following methods
  1. getTemperature()
  2. getHumidity()
  3. getPressure()
  
  These three ⬆ methods return the most recent weather data
  
  4. measurementsChanged()
  Note whenever the weather data is updated the measurementsChanged
  gets called
  
  /*
    This method gets called 
    whenever the weather measurements 
    have been updated
  */
  
  public void measurementsChanged() {
    // Your code goes here.
  }
  
  
  Our focus points:
  1. Expandability - Other developers may want to create new 
     custom displays.
  
```

Use of Observer Design Pattern in modern programming languages
JavaBeans

The observer pattern is a behavioral design pattern where an
object called the subject maintains a list of dependents, called
observers, and notifies them automatically of any state changes, 
usually by calling one of their methods.

The `JavaBeans` `PropertyChangeListener` interface is a classic example
of the `Observer` pattern in action in java.



