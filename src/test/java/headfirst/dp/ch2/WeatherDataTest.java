package headfirst.dp.ch2;

/**
 * Created by jacshen on 3/13/14.
 */
public class WeatherDataTest {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionDisplay currentDisplay =
        new CurrentConditionDisplay(weatherData);

    weatherData.setMeasurements(80,65,30.4f);
    weatherData.setMeasurements(82,70,29.2f);
    weatherData.setMeasurements(78,90,29.2f);
  }

}
