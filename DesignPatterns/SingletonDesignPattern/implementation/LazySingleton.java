package DesignPatterns.SingletonDesignPattern.implementation;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("LazySingleton is initiated.");
    }
    
    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void doSomething() {
        System.out.println("Something is done in LazySingleton.");
    }

}