package DesignPatterns.creational.SingletonDesignPattern.implementation;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton() {
        System.out.println("StaticBlockSingleton is initiated.");
    }
    
    // Static block for initialization
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}