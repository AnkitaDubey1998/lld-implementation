package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.creator.GUIFactory;
import AbstractFactoryDesignPattern.product.Button;
import AbstractFactoryDesignPattern.product.CheckBox;

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
