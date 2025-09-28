package Problems.VendingMachine.machineState;

import Problems.VendingMachine.VendingMachine;
import Problems.VendingMachine.enums.Coin;
import Problems.VendingMachine.enums.PaymentMode;
import Problems.VendingMachine.payment.PaymentStrategy;

import java.util.List;

public class HasMoneyState implements VendingMachineState {

    private PaymentStrategy paymentStrategy;

    public HasMoneyState(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public void selectItem(VendingMachine vendingMachine, String itemCode) {
        System.out.println("Item already selected. Payment is in Progress..");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, PaymentMode paymentMode, List<Coin> coinList) {
        System.out.println("Money already inserted. Payment is in Progress..");
    }

    @Override
    public void processPayment(VendingMachine vendingMachine) {
        paymentStrategy.processPayment();
        vendingMachine.setState(new DispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Cannot dispense item. Payment is in Progress..");
    }
}
