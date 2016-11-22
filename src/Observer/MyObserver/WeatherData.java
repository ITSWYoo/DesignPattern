package Observer.MyObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoo on 2016-09-28.
 */
public class WeatherData implements Subject {
    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (observerList.size() == 0) System.out.println("구독자가 없네요");
        else {
            for (Observer observer : observerList) {
                observer.update(temperature, humidity, pressure);
            }
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void getTemperature() {
    }

    public void getHumidity() {
    }

    public void getPressure() {
    }

    public void measurementsChanged() {
        notifyObservers();
    }
}
