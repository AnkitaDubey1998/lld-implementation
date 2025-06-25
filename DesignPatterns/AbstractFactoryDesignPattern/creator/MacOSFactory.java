package DesignPatterns.AbstractFactoryDesignPattern.creator;

import DesignPatterns.AbstractFactoryDesignPattern.product.Button;
import DesignPatterns.AbstractFactoryDesignPattern.product.CheckBox;
import DesignPatterns.AbstractFactoryDesignPattern.product.MacOSButton;
import DesignPatterns.AbstractFactoryDesignPattern.product.MacOSCheckBox;

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
