package designPatternObserver.observerImpl;

import designPatternObserver.interfaces.Display;
import designPatternObserver.interfaces.Observer;

public class CurrentCondition implements Observer, Display {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;


    public  CurrentCondition(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        displayUp();

    }

    @Override
    public void displayUp() {
        System.out.printf("%nCurrent conditions: %n%.2f" +
                "F degrees and %.2f humidity%n", temperature,humidity);
    }
}
