package Problems.VendingMachine.machineState;

import Problems.VendingMachine.VendingMachine;
import Problems.VendingMachine.enums.Coin;
import Problems.VendingMachine.enums.PaymentMode;
import Problems.VendingMachine.payment.PaymentFactory;
import Problems.VendingMachine.payment.PaymentStrategy;

import java.util.List;
import java.util.Objects;

import static Problems.VendingMachine.enums.PaymentMode.CASH;

public class ItemSelectedState implements VendingMachineState {

    @Override
    public void selectItem(VendingMachine vendingMachine, String itemCode) {
        System.out.println("Item already selected. Make payment");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, PaymentMode paymentMode, List<Coin> coinList) {
        PaymentStrategy paymentStrategy = PaymentFactory.getPaymentStrategy(paymentMode);
        if(CASH.equals(paymentMode) && (Objects.isNull(coinList) || coinList.isEmpty())) {
            System.out.println("No coins are inserted. Please insert coin");
        }
        int insertedAmount;
        if(CASH.equals(paymentMode)) {
            insertedAmount = coinList.stream().mapToInt(c -> c.value).sum();
            if(insertedAmount < vendingMachine.getSelectedItem().getItemPrice()) {
                System.out.println("Insufficient coins inserted. Insert more coin");
                return;
            }
        }
        // handle validations for UPI mode (if any)
        vendingMachine.setState(new HasMoneyState(paymentStrategy));
    }

    @Override
    public void processPayment(VendingMachine vendingMachine) {
        System.out.println("Money not inserted yet");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Money not inserted yet. Make payment first");
    }
}
