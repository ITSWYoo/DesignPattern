package Observer.Weather;

/**
 * Created by Yoo on 2016-11-20.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
