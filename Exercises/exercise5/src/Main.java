import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Climate {
    private static Climate instance;

    private Climate() {
    }

    public static Climate getInstance() {
        if (instance == null) {
            instance = new Climate();
        }
        return instance;
    }

    public int getTemperature() {
        return new Random().nextInt(30) + 1;
    }
}

interface Observer {
    void update(int temperature);
}

class ClimateObserver implements Observer {
    private String name;

    public ClimateObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " received an update. Temperature is now: " + temperature + " degrees Celsius");
    }
}

class ClimateSubject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(int temperature) {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

interface TemperatureDisplayStrategy {
    void displayTemperature(int temperature);
}

class CelsiusTemperatureDisplay implements TemperatureDisplayStrategy {
    @Override
    public void displayTemperature(int temperature) {
        System.out.println("Temperature: " + temperature + " degrees Celsius");
    }
}

class FahrenheitTemperatureDisplay implements TemperatureDisplayStrategy {
    @Override
    public void displayTemperature(int temperature) {
        int fahrenheitTemperature = (int) (temperature * 1.8 + 32);
        System.out.println("Temperature: " + fahrenheitTemperature + " degrees Fahrenheit");
    }
}

public class Main {
    public static void main(String[] args) {
        Climate climate = Climate.getInstance();

        ClimateObserver observer1 = new ClimateObserver("Observer 1");
        ClimateObserver observer2 = new ClimateObserver("Observer 2");

        ClimateSubject climateSubject = new ClimateSubject();
        climateSubject.addObserver(observer1);
        climateSubject.addObserver(observer2);

        TemperatureDisplayStrategy celsiusDisplay = new CelsiusTemperatureDisplay();
        TemperatureDisplayStrategy fahrenheitDisplay = new FahrenheitTemperatureDisplay();

        int currentTemperature = climate.getTemperature();
        climateSubject.notifyObservers(currentTemperature);

        celsiusDisplay.displayTemperature(currentTemperature);

        fahrenheitDisplay.displayTemperature(currentTemperature);
    }
}
