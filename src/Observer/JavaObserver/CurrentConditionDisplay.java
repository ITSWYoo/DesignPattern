package Observer.JavaObserver;

import java.util.Observable;

/**
 * Created by Yoo on 2016-09-28.
 */
public class CurrentConditionDisplay implements java.util.Observer, DisplayElemnet {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
            if (o instanceof WeatherData){
                WeatherData weatherData = (WeatherData)o;
                this.temperature = weatherData.getTemperature();
                this.humidity = weatherData.getHumidity();
                display();
            }
    }

    @Override
    public void display() {
        System.out.println(temperature+","+humidity);
    }
}
