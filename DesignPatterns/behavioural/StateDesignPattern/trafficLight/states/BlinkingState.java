package DesignPatterns.behavioural.StateDesignPattern.trafficLight.states;

import DesignPatterns.behavioural.StateDesignPattern.trafficLight.TrafficLight;

public class BlinkingState implements TrafficLightState {
    @Override
    public void changeToNextColor(TrafficLight trafficLight) {
        System.out.println("\nChanging from BLINKING to MAINTENANCE mode .....");
        trafficLight.setState(new MaintenanceState());
    }

    @Override
    public String getColor() {
        return "BLUE WHITE BLINKING";
    }
}
