package DesignPatterns.behavioural.StateDesignPattern.trafficLight.states;

import DesignPatterns.behavioural.StateDesignPattern.trafficLight.TrafficLight;

public interface TrafficLightState {
    void changeToNextColor(TrafficLight trafficLight);
    String getColor();
}
