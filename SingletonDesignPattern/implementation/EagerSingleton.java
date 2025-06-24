package SingletonDesignPattern.implementation;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton() {
        System.out.println("EagerSingleton is initiated.");
    }
    
    public static EagerSingleton getInstance() {
        return instance;
    }
}