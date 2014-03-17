package headfirst.dp.ch1;

/**
 * Created by jacshen on 3/13/14.
 */
public class DuckTest {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
    mallard.display();

    Duck model = new ModelDuck();
    model.performFly();
    model.performQuack();
    model.display();
    model.setFlyBehavior(new FlyWithRocket());
    model.performFly();
  }

}
