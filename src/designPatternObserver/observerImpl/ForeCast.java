package designPatternObserver.observerImpl;

import designPatternObserver.interfaces.Display;
import designPatternObserver.interfaces.Observer;

public class ForeCast implements Observer, Display {

    private float temperature;
    private float humidity;

    private WeatherData weatherData;
    private float lastPressure;
    private float currentPressure;

    public ForeCast(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        displayUp();

    }
    @Override
    public void displayUp() {
        System.out.println("Forecast:  ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");

        }
    }
}
