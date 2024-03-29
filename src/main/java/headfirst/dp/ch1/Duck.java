package headfirst.dp.ch1;

/**
 * Created by jacshen on 3/13/14.
 */
public abstract class Duck {

  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  public Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys");

  }

  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior =fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }

}
