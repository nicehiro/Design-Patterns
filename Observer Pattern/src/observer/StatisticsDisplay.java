package observer;

import observer.MyObserver;
import subject.Subject;

/**
 * Created by hiro on 12/26/16.
 */
public class StatisticsDisplay implements MyObserver, DisplayElement {
    private float temperature;

    private float humidity;

    private float pressure;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("observer.StatisticsDisplay: " + temperature + "F degrees and " + humidity + "% humidity" + pressure + "N pressure");
    }
}
