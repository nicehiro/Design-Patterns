package subject;

import observer.MyObserver;

import java.util.ArrayList;

/**
 * Created by hiro on 12/26/16.
 */
public class WeatherData implements Subject {
    private ArrayList observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            MyObserver observer = (MyObserver) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
}
