package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.creator.GUIFactory;
import AbstractFactoryDesignPattern.creator.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;
        if(osName.contains("mac")) {
            factory = new WindowsFactory();
        } else {
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
