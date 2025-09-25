package DesignPatterns.behavioural.StateDesignPattern.vendingMachine.state;

import DesignPatterns.behavioural.StateDesignPattern.vendingMachine.VendingMachine;

public class ItemSelectedState implements MachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String itemCode) {
        System.out.println("Item already selected: " + vendingMachine.getSelectedItem());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, double amount) {
        System.out.println("Inserted $" + amount + " for item: " + vendingMachine.getSelectedItem());
        vendingMachine.setInsertedAmount(amount);
        vendingMachine.setState(new HasMoneyState());
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Insert coin before dispensing.");
    }
}
