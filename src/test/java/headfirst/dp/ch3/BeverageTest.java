package headfirst.dp.ch3;

/**
 * Created by jacshen on 3/14/14.
 */
public class BeverageTest {
  public static void main(String args[]) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription()
    + ": $" + beverage.cost());

    Beverage beverage1 = new HouseBlend();
    beverage1 = new Mocha(beverage1);
    System.out.println(beverage1.getDescription()
    + ": $" + beverage1.cost());
  }
}
