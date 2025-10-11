package Problems.VendingMachine;

import Problems.VendingMachine.enums.Coin;
import Problems.VendingMachine.enums.PaymentMode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();

        vendingMachine.addItem(new Item("101", "Lays", 20.0, 7));
        vendingMachine.addItem(new Item("102", "Kurkure", 20.0, 6));
        vendingMachine.addItem(new Item("201", "Parle G Biscuit", 10.0, 8));
        vendingMachine.addItem(new Item("202", "Salted Peanuts", 15.0, 10));
        vendingMachine.addItem(new Item("301", "Diet Coke", 40.0, 5));
        vendingMachine.addItem(new Item("302", "Tropicana Orange Juice", 45.0, 3));

        System.out.println("\n----- Step 1 : Select an item -----");
        vendingMachine.selectItem("101");

        System.out.println("\n----- Step 2 : Insert coins -----");
        /* by default making only cash payments */
        List<Coin> coinList = new ArrayList<>();
        coinList.add(Coin.TEN_RUPEES);
        coinList.add(Coin.FIVE_RUPEES);
        coinList.add(Coin.FIVE_RUPEES);
        vendingMachine.makePayment(PaymentMode.CASH, coinList);

        System.out.println("\n----- Step 3 : Processing payment -----");
        vendingMachine.processPayment();

        System.out.println("\n----- Step 4 : Dispensing Item -----");
        vendingMachine.dispenseItem();
    }
}
