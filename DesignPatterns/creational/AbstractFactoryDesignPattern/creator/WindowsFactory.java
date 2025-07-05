package DesignPatterns.creational.AbstractFactoryDesignPattern.creator;

import DesignPatterns.creational.AbstractFactoryDesignPattern.product.Button;
import DesignPatterns.creational.AbstractFactoryDesignPattern.product.CheckBox;
import DesignPatterns.creational.AbstractFactoryDesignPattern.product.WindowsButton;
import DesignPatterns.creational.AbstractFactoryDesignPattern.product.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
