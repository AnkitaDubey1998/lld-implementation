package DesignPatterns.creational.AbstractFactoryDesignPattern.product;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Creating a Windows Button");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked");
    }
}
