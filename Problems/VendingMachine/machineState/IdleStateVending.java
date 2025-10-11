package Problems.VendingMachine.machineState;

import Problems.VendingMachine.VendingMachine;
import Problems.VendingMachine.enums.Coin;
import Problems.VendingMachine.enums.PaymentMode;

import java.util.List;

public class IdleStateVending implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String itemCode) {
        System.out.println("Selected item : " + itemCode);
        vendingMachine.setState(new ItemSelectedState());
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, PaymentMode paymentMode, List<Coin> coinList) {
        System.out.println("No item selected. Select item first");
    }

    @Override
    public void processPayment(VendingMachine vendingMachine) {
        System.out.println("No item selected. Select item first");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("No item selected. Select item first");
    }
}
