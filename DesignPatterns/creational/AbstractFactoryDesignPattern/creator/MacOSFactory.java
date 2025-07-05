package DesignPatterns.creational.AbstractFactoryDesignPattern.creator;

import DesignPatterns.creational.AbstractFactoryDesignPattern.product.Button;
import DesignPatterns.creational.AbstractFactoryDesignPattern.product.CheckBox;
import DesignPatterns.creational.AbstractFactoryDesignPattern.product.MacOSButton;
import DesignPatterns.creational.AbstractFactoryDesignPattern.product.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
