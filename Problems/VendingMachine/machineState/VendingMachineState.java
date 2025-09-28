package Problems.VendingMachine.machineState;

import Problems.VendingMachine.VendingMachine;
import Problems.VendingMachine.enums.Coin;
import Problems.VendingMachine.enums.PaymentMode;

import java.util.List;

public interface VendingMachineState {
    void selectItem(VendingMachine vendingMachine, String itemCode);
    void insertMoney(VendingMachine vendingMachine, PaymentMode paymentMode, List<Coin> coinList);
    void processPayment(VendingMachine vendingMachine);
    void dispenseItem(VendingMachine vendingMachine);
}
