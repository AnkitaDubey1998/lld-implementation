package DesignPatterns.behavioural.StateDesignPattern.trafficLight;

import DesignPatterns.behavioural.StateDesignPattern.trafficLight.states.RedState;
import DesignPatterns.behavioural.StateDesignPattern.trafficLight.states.TrafficLightState;

public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        this.currentState = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void changedToNextColor() {
        currentState.changeToNextColor(this);
    }

    public String getColor() {
        return currentState.getColor();
    }
}
