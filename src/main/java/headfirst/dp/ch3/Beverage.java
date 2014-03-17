package headfirst.dp.ch3;

/**
 * Created by jacshen on 3/14/14.
 */
public abstract class Beverage {
  String description = "Unknown Beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

}
