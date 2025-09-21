package DesignPatterns.behavioural.CommandDesignPattern.receivers;

public class Thermostat {
    // default temperature
    private int currentTemperature = 20;

    public void setTemperature(int temperature) {
        this.currentTemperature = temperature;
        System.out.println("Thermostat set to " + temperature + "°C");
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
