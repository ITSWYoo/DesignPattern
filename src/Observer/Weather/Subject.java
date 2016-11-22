package Observer.Weather;


/**
 * Created by Yoo on 2016-11-20.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
