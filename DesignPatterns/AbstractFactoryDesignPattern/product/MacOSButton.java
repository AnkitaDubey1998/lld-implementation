package DesignPatterns.AbstractFactoryDesignPattern.product;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Creating a Mac OS Button");
    }

    @Override
    public void onClick() {
        System.out.println("Mac OS button clicked");
    }
}
