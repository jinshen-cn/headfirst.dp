package headfirst.dp.ch1;

/**
 * Created by jacshen on 3/13/14.
 */
public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard duck.");
  }

}
