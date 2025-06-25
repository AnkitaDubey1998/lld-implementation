package DesignPatterns.AbstractFactoryDesignPattern.creator;

import DesignPatterns.AbstractFactoryDesignPattern.product.Button;
import DesignPatterns.AbstractFactoryDesignPattern.product.CheckBox;
import DesignPatterns.AbstractFactoryDesignPattern.product.WindowsButton;
import DesignPatterns.AbstractFactoryDesignPattern.product.WindowsCheckBox;

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
