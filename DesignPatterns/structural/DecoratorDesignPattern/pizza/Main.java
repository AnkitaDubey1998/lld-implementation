package DesignPatterns.structural.DecoratorDesignPattern.pizza;

import DesignPatterns.structural.DecoratorDesignPattern.pizza.decorator.ExtraCheese;
import DesignPatterns.structural.DecoratorDesignPattern.pizza.decorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        // Veg Delight Pizza
        BasePizza pizza = new VegDelight();
        System.out.println("Veg Delight : " + pizza.cost());

        // Veg Delight + Extra Cheese
        pizza = new ExtraCheese(new VegDelight());
        System.out.println("Veg Delight + Extra Cheese : " + pizza.cost());

        // Veg Delight + Mushroom + Extra Cheese
        pizza = new ExtraCheese(new Mushroom(new VegDelight()));
        System.out.println("Veg Delight + Mushroom + Extra Cheese : " + pizza.cost());
    }
}
