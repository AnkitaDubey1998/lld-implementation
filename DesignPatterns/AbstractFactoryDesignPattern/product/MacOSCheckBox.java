package DesignPatterns.AbstractFactoryDesignPattern.product;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Creating a Mac OS Checkbox");
    }

    @Override
    public void onSelect() {
        System.out.println("Mac OS checkbox clicked");
    }
}
