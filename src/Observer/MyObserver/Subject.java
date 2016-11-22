package Observer.MyObserver;

/**
 * Created by Yoo on 2016-09-28.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
