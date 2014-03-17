package headfirst.dp.ch2;

/**
 * Created by jacshen on 3/13/14.
 */
public interface Subject {

  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();

}
