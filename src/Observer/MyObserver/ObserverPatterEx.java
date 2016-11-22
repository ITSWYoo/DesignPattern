package Observer.MyObserver;

/**
 * Created by Yoo on 2016-09-28.
 */

//디자인 원칙 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.
public class ObserverPatterEx {
    public static void main(String args[])
    {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData); //구독

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.removeObserver(currentConditionDisplay);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
