package headfirst.dp.ch2;

import java.util.*;

/**
 * Created by jacshen on 3/13/14.
 */
public class CurrentConditionDisplay implements java.util.Observer, DisplayElement {
  Observable observable;
  private float temperature;
  private float humidity;

  public CurrentConditionDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  public void update(Observable obs, Object arg) {
    if (obs instanceof WeatherData) {
      WeatherData weatherData = (WeatherData)obs;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
    }
    display();
  }

  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }

}
