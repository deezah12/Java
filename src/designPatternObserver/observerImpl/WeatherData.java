package designPatternObserver.observerImpl;

import designPatternObserver.interfaces.ObservableSubject;
import designPatternObserver.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ObservableSubject {

    private float temperature;
    private float humidity;
    private  float pressure;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public  void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for (Observer observe :observers) {
            observe.update();
        }
    }
    public void measurementsChanged(){
        notifyObserver();
    }

    public  void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
