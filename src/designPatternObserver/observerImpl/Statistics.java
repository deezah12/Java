package designPatternObserver.observerImpl;

import designPatternObserver.interfaces.Display;
import designPatternObserver.interfaces.Observer;

public class Statistics implements Observer, Display {
    private  int numberOfReadings;
    private  float maximumTemp = 0.0f;
    private  float minimumTemp = 200.0f;
    private  float temperatureSum = 0.0f;
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public Statistics(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update() {
        temperatureSum = temperatureSum + weatherData.getTemperature();
        numberOfReadings++;

        if (weatherData.getTemperature() > maximumTemp){
            maximumTemp = weatherData.getTemperature();
        } else if (weatherData.getTemperature() < minimumTemp) {
            minimumTemp = weatherData.getTemperature();
        }

        displayUp();
    }
    @Override
    public void displayUp() {
        System.out.println("Weather statistics: ");
        System.out.printf("Maximum Temperature is: %.2f,%nMinimum temperature is: %.2f" +
                ",%nAverage temperature is: %.2f%n",
                maximumTemp,minimumTemp,(temperatureSum/numberOfReadings));
    }
}
