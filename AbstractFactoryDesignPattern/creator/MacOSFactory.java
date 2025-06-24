package AbstractFactoryDesignPattern.creator;

import AbstractFactoryDesignPattern.product.Button;
import AbstractFactoryDesignPattern.product.CheckBox;
import AbstractFactoryDesignPattern.product.MacOSButton;
import AbstractFactoryDesignPattern.product.MacOSCheckBox;

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
