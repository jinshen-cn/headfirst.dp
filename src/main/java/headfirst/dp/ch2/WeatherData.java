package headfirst.dp.ch2;

import sun.management.resources.agent_pt_BR;

import java.util.*;

/**
 * Created by jacshen on 3/13/14.
 */
public class WeatherData extends Observable {
  private ArrayList observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
  }

  public void measurementsChanged() {
    setChanged();
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

}
