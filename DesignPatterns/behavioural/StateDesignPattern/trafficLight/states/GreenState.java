package DesignPatterns.behavioural.StateDesignPattern.trafficLight.states;

import DesignPatterns.behavioural.StateDesignPattern.trafficLight.TrafficLight;

public class GreenState implements TrafficLightState {
    @Override
    public void changeToNextColor(TrafficLight trafficLight) {
        System.out.println("\nChanging from GREEN to YELLOW");
        trafficLight.setState(new YellowState());
    }

    @Override
    public String getColor() {
        return "GREEN";
    }
}
