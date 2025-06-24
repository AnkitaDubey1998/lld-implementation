package AbstractFactoryDesignPattern.creator;

import AbstractFactoryDesignPattern.product.Button;
import AbstractFactoryDesignPattern.product.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
