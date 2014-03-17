package headfirst.dp.ch1;

/**
 * Created by jacshen on 3/13/14.
 */
public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("I'm a model duck.");
  }

}
