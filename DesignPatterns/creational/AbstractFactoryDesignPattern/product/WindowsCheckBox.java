package DesignPatterns.creational.AbstractFactoryDesignPattern.product;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Creating a Windows Checkbox");
    }

    @Override
    public void onSelect() {
        System.out.println("Windows checkbox selected");
    }
}
