package DesignPatterns.behavioural.StateDesignPattern.trafficLight.states;

import DesignPatterns.behavioural.StateDesignPattern.trafficLight.TrafficLight;

public class YellowState implements TrafficLightState {
    @Override
    public void changeToNextColor(TrafficLight trafficLight) {
        System.out.println("\nChanging from YELLOW to RED");
        trafficLight.setState(new RedState());
    }

    @Override
    public String getColor() {
        return "YELLOW";
    }
}
