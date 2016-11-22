package Observer.Weather;

/**
 * Created by Yoo on 2016-11-20.
 */
public class WeatherStation {
    public static void main(String args[]) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay[] currentConditionDisplays = new CurrentConditionDisplay[3];

        System.out.println(currentConditionDisplays[0]);
        for(CurrentConditionDisplay currentConditionDisplay : currentConditionDisplays){
            currentConditionDisplay = new CurrentConditionDisplay(weatherData);
            System.out.println(currentConditionDisplay);
            System.out.println(currentConditionDisplays[0]);
        }

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(80, 61, 30.5f);

    }
}
