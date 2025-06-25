package DesignPatterns.AbstractFactoryDesignPattern;

import DesignPatterns.AbstractFactoryDesignPattern.creator.GUIFactory;
import DesignPatterns.AbstractFactoryDesignPattern.product.Button;
import DesignPatterns.AbstractFactoryDesignPattern.product.CheckBox;

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
