package AbstractFactoryDesignPattern.creator;

import AbstractFactoryDesignPattern.product.Button;
import AbstractFactoryDesignPattern.product.CheckBox;
import AbstractFactoryDesignPattern.product.WindowsButton;
import AbstractFactoryDesignPattern.product.WindowsCheckBox;

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
