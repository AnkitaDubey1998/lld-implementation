package DesignPatterns.creational.AbstractFactoryDesignPattern;

import DesignPatterns.creational.AbstractFactoryDesignPattern.creator.GUIFactory;
import DesignPatterns.creational.AbstractFactoryDesignPattern.product.Button;
import DesignPatterns.creational.AbstractFactoryDesignPattern.product.CheckBox;

public class Application {
    private final Button button;
    private final CheckBox checkBox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void renderUI() {
        button.paint();
        checkBox.paint();
    }
}
