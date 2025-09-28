package Problems.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();

        vendingMachine.addItem(new Item("101", "Lays", 20.0, 7));
        vendingMachine.addItem(new Item("102", "Kurkure", 20.0, 6));
        vendingMachine.addItem(new Item("201", "Parle G Biscuit", 10.0, 8));
        vendingMachine.addItem(new Item("202", "Salted Peanuts", 15.0, 10));
        vendingMachine.addItem(new Item("301", "Diet Coke", 40.0, 5));
        vendingMachine.addItem(new Item("302", "Tropicana Orange Juice", 45.0, 3));
    }
}
