package DesignPatterns.AbstractFactoryDesignPattern.creator;

import DesignPatterns.AbstractFactoryDesignPattern.product.Button;
import DesignPatterns.AbstractFactoryDesignPattern.product.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
