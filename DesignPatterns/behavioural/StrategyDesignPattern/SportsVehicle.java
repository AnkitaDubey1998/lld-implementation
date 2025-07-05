package DesignPatterns.behavioural.StrategyDesignPattern;

import DesignPatterns.behavioural.StrategyDesignPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
    
}
