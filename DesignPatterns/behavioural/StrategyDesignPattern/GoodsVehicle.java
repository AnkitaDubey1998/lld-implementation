package DesignPatterns.behavioural.StrategyDesignPattern;

import DesignPatterns.behavioural.StrategyDesignPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
    
}
