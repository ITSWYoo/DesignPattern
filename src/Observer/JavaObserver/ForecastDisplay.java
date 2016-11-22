package Observer.JavaObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yoo on 2016-09-28.
 */
public class ForecastDisplay implements Observer, DisplayElemnet {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("lastPressure =" +lastPressure+", currentPressure = "+currentPressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData)
        {
            lastPressure = currentPressure;
            currentPressure = ((WeatherData) o).getPressure();
        }
        display();
    }
}
