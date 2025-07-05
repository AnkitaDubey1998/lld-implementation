package DesignPatterns.creational.SingletonDesignPattern.implementation;

public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("BillPughSingleton is initiated.");
    }
    
    // Static inner class that holds the instance
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}