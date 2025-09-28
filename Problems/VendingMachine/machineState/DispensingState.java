package Problems.VendingMachine.machineState;

import Problems.VendingMachine.VendingMachine;
import Problems.VendingMachine.enums.Coin;
import Problems.VendingMachine.enums.PaymentMode;

import java.util.List;

public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String itemCode) {

    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, PaymentMode paymentMode, List<Coin> coinList) {

    }

    @Override
    public void processPayment(VendingMachine vendingMachine) {

    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Dispensing item : " + vendingMachine.getSelectedItem().getItemName());
        // simulate dispensing
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Dispensed");
        vendingMachine.reduceQuantity(vendingMachine.getSelectedItem().getItemCode());
        vendingMachine.resetMachine();
    }
}
