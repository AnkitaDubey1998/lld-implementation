package DesignPatterns.behavioural.StateDesignPattern.trafficLight.states;

import DesignPatterns.behavioural.StateDesignPattern.trafficLight.TrafficLight;

public class RedState implements TrafficLightState {
    @Override
    public void changeToNextColor(TrafficLight trafficLight) {
        System.out.println("\nChanging from RED to GREEN");
        trafficLight.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
