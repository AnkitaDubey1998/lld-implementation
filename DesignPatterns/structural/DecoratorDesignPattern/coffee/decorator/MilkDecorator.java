package DesignPatterns.structural.DecoratorDesignPattern.coffee.decorator;

import DesignPatterns.structural.DecoratorDesignPattern.coffee.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}
