package DesignPatterns.creational.AbstractFactoryDesignPattern.creator;

import DesignPatterns.creational.AbstractFactoryDesignPattern.product.Button;
import DesignPatterns.creational.AbstractFactoryDesignPattern.product.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
