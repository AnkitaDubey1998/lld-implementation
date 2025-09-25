package DesignPatterns.behavioural.StateDesignPattern.trafficLight.states;

import DesignPatterns.behavioural.StateDesignPattern.trafficLight.TrafficLight;

public class MaintenanceState implements TrafficLightState {
    @Override
    public void changeToNextColor(TrafficLight trafficLight) {
        System.out.println("\nMaintenance done. Changing to RED");
        trafficLight.setState(new RedState());
    }

    @Override
    public String getColor() {
        return "MAINTENANCE";
    }
}
