package DesignPatterns.behavioural.StrategyDesignPattern;

import DesignPatterns.behavioural.StrategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {
    
    private DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}