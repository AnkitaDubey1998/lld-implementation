package DesignPatterns.behavioural.StrategyDesignPattern;

import DesignPatterns.behavioural.StrategyDesignPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

}
