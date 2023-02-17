package designPatternObserver;

import designPatternObserver.observerImpl.CurrentCondition;
import designPatternObserver.observerImpl.ForeCast;
import designPatternObserver.observerImpl.Statistics;
import designPatternObserver.observerImpl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondition currentCondition = new CurrentCondition(weatherData);
        ForeCast foreCast = new ForeCast(weatherData);
        Statistics statistics = new Statistics(weatherData);

        weatherData.setMeasurement(80,65,30.4f);
        weatherData.setMeasurement(82,70,29.2f);
        //weatherData.setMeasurement(78,90,29.2f);

       // weatherData.removeObserver(foreCast);
       // weatherData.setMeasurement(62, 90, 28.1f);
    }
}
