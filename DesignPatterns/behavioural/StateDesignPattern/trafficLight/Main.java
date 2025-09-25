package DesignPatterns.behavioural.StateDesignPattern.trafficLight;

import DesignPatterns.behavioural.StateDesignPattern.trafficLight.states.BlinkingState;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        System.out.println("Initial color : " + trafficLight.getColor());

        trafficLight.changedToNextColor();
        System.out.println("Color : " + trafficLight.getColor());
        trafficLight.changedToNextColor();
        System.out.println("Color : " + trafficLight.getColor());
        trafficLight.changedToNextColor();
        System.out.println("Color : " + trafficLight.getColor());
        // changing to BLINKING
        System.out.println("\nTraffic Light not working ... BLINKING mode");
        trafficLight.setState(new BlinkingState());
        System.out.println("Color : " + trafficLight.getColor());
        trafficLight.changedToNextColor();
        System.out.println("Color : " + trafficLight.getColor());
        trafficLight.changedToNextColor();
        System.out.println("Color : " + trafficLight.getColor());
    }
}
