package DesignPatterns.structural.DecoratorDesignPattern.pizza.decorator;

import DesignPatterns.structural.DecoratorDesignPattern.pizza.BasePizza;

public class Mushroom extends ToppingDecorator {

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }

}
